package br.senai.sp.informatica.exercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mesesComSair {
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
		
		
String entrada ="";
		
		entrada = JOptionPane.showInputDialog("Digite o numero do mês ou \"sair\" para sair");
		
while(!entrada.equals("sair")) {
    
	if(entrada.matches("[0-9]+")== true) {
    	int temp = Integer.parseInt(entrada);
    			if(temp >=1 && temp <=12) {
    				temp--;
    				JOptionPane.showMessageDialog(null, " O Nome do Mês é: "+meses.get(temp));
				
    			}else {
    				JOptionPane.showMessageDialog(null, "Numero errado");
    				}
    }else {
    			if(!entrada.equals("sair")) {
    				JOptionPane.showMessageDialog(null, "Numero errado");
    			}
	
    		}
    			entrada = JOptionPane.showInputDialog("Digite o numero do mês ou \"sair\" para sair");
 }
	}
	}
