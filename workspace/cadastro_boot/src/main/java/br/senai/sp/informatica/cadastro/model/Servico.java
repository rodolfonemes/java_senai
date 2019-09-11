package br.senai.sp.informatica.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Servico {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServico;
	@Size(min=3, max=150, message = "O nome do serviço deve ter no minimo 3 e no maximo 150 caracteres")
	private String nome;
	private boolean desativado;
	@Transient
	private boolean selecionado;
}
