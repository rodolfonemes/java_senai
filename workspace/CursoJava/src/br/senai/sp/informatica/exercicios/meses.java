package br.senai.sp.informatica.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class meses {
	public static void main(String[] args) {
		
		int numerosMeses = 0;
		ArrayList meses = new ArrayList();
		
		meses.add("Janeiro");
		meses.add("Fevereiro");
		meses.add("Mar�o");
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
			JOptionPane.showMessageDialog(null, "M�s errado digite novamente o n�mero do m�s");
			numerosMeses = Integer.parseInt(JOptionPane.showInputDialog("Digite o N�mero do M�s"));
			
		}
		numerosMeses--;
		JOptionPane.showMessageDialog(null, " O Nome do M�s �: "+meses.get(numerosMeses));
	}

}
