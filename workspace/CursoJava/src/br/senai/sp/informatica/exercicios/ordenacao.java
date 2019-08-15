package br.senai.sp.informatica.exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import br.senai.sp.informatica.introducao.Documentacao;

public class ordenacao {
public static void main(String[] args) {
	
	ArrayList numeros = new ArrayList();
	ArrayList teste = new ArrayList();
	int temp;
	int n2 = 1;
	for (int n=0 ; n<=4 ; n++) {
		temp = Integer.parseInt(JOptionPane.showInputDialog("digite o " + n2 + " º numero "));
		n2++;
		numeros.add(temp);		
	}
	
	Collections.sort(numeros);

for (int i = 4; i >= 0 ;  i--) {
		teste.add(numeros.get(i));
		}
	JOptionPane.showMessageDialog(null, "Numeros em Ordem   "   + numeros + "\n" +
										"Numeros invertidos   "   + teste);
	
}

  }

