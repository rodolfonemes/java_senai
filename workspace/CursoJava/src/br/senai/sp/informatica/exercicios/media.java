package br.senai.sp.informatica.exercicios;

import javax.swing.JOptionPane;

public class media {
	public static void main(String[] args) {
		
		Double nota1;
		Double nota2;
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1 nota entre 0 e 100"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2 nota entre 0 e 100"));
		
		double media = (nota1 + nota2) / 2;
		String avaliacao;
		if(media <=60) {
			avaliacao = "Insuficiente";
		}else if(media >=61 && media <=80) {
			avaliacao = "Satisfatoria";	
			}else if(media >=81 && media <=90) {
				avaliacao = "Boa";	
				}else {
					avaliacao="Excelente";
				}
		
		
		
		JOptionPane.showMessageDialog(null,"A sua media é: " + media + " - " + avaliacao);
	}
}
