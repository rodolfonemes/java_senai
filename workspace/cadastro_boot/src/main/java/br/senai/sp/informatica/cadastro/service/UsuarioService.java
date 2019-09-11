package br.senai.sp.informatica.cadastro.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.sp.informatica.cadastro.model.Usuario;
import br.senai.sp.informatica.cadastro.repo.UsuarioRepo;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepo repo;
	public void salvar(Usuario usuario) {
		Usuario old_Usuario;
		
		if(!usuario.getOld_nome().equalsIgnoreCase(usuario.getNome())) {
			old_Usuario = getUsuario(usuario.getOld_nome());
			removeUsuario(usuario.getOld_nome());
		}else {
			old_Usuario = getUsuario(usuario.getNome());
		}
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
	}

