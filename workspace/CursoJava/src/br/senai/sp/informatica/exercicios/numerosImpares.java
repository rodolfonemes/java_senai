package br.senai.sp.informatica.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class numerosImpares {
public static void main(String[] args) {
	int total=1;
	ArrayList lista = new ArrayList<>();
	
	for(int i = 1; i <= 15; i+=2){
		total = total * i;
		lista.add(i);
	}
	  String texto = "";
	  String texto2 = " x ";
	
	for(int i = 0; i < lista.size(); i++) {
		  texto += String.valueOf(lista.get(i)) + texto2;
		  }
	
	JOptionPane.showMessageDialog(null, texto + "\n" + "Total: " +total);

}
}
