package br.senai.sp.informatica.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class meses {
	public static void main(String[] args) {
		
		int numerosMeses = 0;
		ArrayList meses = new ArrayList();
		
		meses.add("Janeiro");
		meses.add("Fevereiro");
		meses.add("Março");
		meses.add("Abril");
		meses.add("Maio");
		meses.add("Junho");
		meses.add("Julho");
		meses.add("Agosto");
		meses.add("Setembro");
		meses.add("Outubro");
		meses.add("Novembro");
		meses.add("Dezembro");
		
		numerosMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero do Mes"));
		
		
		
//		if (numerosMeses >=0 && numerosMeses <=12) {
//			numerosMeses--;
//			JOptionPane.showMessageDialog(null, meses.get(numerosMeses));
//			//numerosMeses = 0;
//			}
//		else {
//			JOptionPane.showMessageDialog(null, "mes errado");
//		}

		while(numerosMeses >=13 || numerosMeses <=0) {
			JOptionPane.showMessageDialog(null, "Mês errado digite novamente o número do mês");
			numerosMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Mês"));
			
		}
		numerosMeses--;
		JOptionPane.showMessageDialog(null, " O Nome do Mês é: "+meses.get(numerosMeses));
	}

}
