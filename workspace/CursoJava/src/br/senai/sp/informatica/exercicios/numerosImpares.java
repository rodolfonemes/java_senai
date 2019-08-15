package br.senai.sp.informatica.exercicios;

public class numerosImpares {
public static void main(String[] args) {
	int total=1;
	int [] valores;
	int contador=0;
	for(int i = 1; i <= 15; i+=2){
		total = total * i;
		
		valores[contador]=i;
		contador++;
		System.out.println(valores[contador]);
	}
	System.out.println(total);
}
}
