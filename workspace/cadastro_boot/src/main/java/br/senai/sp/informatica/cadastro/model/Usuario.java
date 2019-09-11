package br.senai.sp.informatica.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import br.senai.sp.informatica.cadastro.model.validacao.Senha;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "users")
public class Usuario {
@Id

@Column(name = "username")
@Size(min=3, max=150, message = "O nome deve ter no minimo 3 e no maximo 150 caracteres")
private String nome;
@Column(name = "enabled")
private boolean habilitado;
@Column(name = "password")
@Senha(message = "A senha deve ter um caracter especial uma letra maiuscula e um numero")
private String senha;
@Transient
private boolean administrador;
@Transient
private String old_nome;

}
