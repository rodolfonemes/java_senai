package br.senai.sp.informatica.objeto;

public class CadCliente {
	public static void main(String[] args) {
		Cliente novo = new Cliente();
		novo.setNome("João da Silva");
		novo.setEmail("jsilva@gmail.com");
		novo.setIdade(32);
		
		System.out.println(novo);
	}
}
