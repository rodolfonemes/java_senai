package br.senai.sp.informatica.cadastro.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import br.senai.sp.informatica.cadastro.model.Autorizacao;
import br.senai.sp.informatica.cadastro.model.Usuario;
import br.senai.sp.informatica.cadastro.repo.AutorizacaoRepo;
import br.senai.sp.informatica.cadastro.repo.UsuarioRepo;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepo repo;
	@Autowired
	private AutorizacaoRepo auth;
	
	
	public void salvar(Usuario usuario) {
		Usuario old_Usuario;
		
		if(!usuario.getOld_nome().equalsIgnoreCase(usuario.getNome())) {
			old_Usuario = getUsuario(usuario.getOld_nome());
			removeUsuario(usuario.getOld_nome());
		}else {
			old_Usuario = getUsuario(usuario.getNome());
		}
		
		auth.save(new Autorizacao(usuario.getNome(),
				usuario.isAdministrador() ? "ROLE_ADMIN" : "ROLE_USER"));
		
		if(old_Usuario !=null) {
			usuario.setSenha(old_Usuario.getSenha());
		}
		repo.save(usuario);			
	}
	
		
	public List<Usuario> getUsuarios(){
		return repo.findAll().stream()
				.filter(usuario ->usuario.isHabilitado())
				.collect(Collectors.toList());
	}
	public Usuario getUsuario(String nome) {
		return repo.findById(nome)
				.orElse(null);
		}
	public boolean removeUsuario(String nome) {
		Usuario usuario = repo.findById(nome)
				.orElse(null);
		if (usuario !=null) {
			
			repo.delete(usuario);
			return true;
		}else {
			return false;
		}
	}
	private Autorizacao getAutorizacao(String nome) {
		return auth.findById(nome).orElse(null);
	}
	public GrantedAuthority getAutorizacoes(String nome) {
		Autorizacao autorizacao = getAutorizacao(nome);
		
		return autorizacao !=null? () -> autorizacao.getPerfil() : null;
	}
	
}

