package br.senai.sp.informatica.exercicios;

import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

import sun.applet.Main;

public class testeDeString {
	
	public static void main(String[] args) {
		
		String entrada ="";
		
		entrada = JOptionPane.showInputDialog("digite um numero ou sair para sair");
		
		while(!entrada.equals("sair")) {
		if(entrada.matches("[0-9]+")== true) {
			int temp = Integer.parseInt(entrada);
			if(temp >=1 && temp <=12) {
				System.out.println("numero entre 1 e 12 " + " - " + temp);
			}else {
				System.out.println("numero menor que  1 e maior 12 " + " - "+ temp);	
			}

		}else {
			if(!entrada.equals("sair")) {
				System.out.println("palavra digitada: " + entrada);
			}
			
		}
		entrada = JOptionPane.showInputDialog("digite um numero ou sair para sair");
		 }
		System.out.println("fora do while");
	}
	}
		
//		String a = "123a";
//		String b = "123";
//		String c = "abcd";
//		String d = "123-456";
//
//		System.out.println("123a " + a.matches("[0-9]+"));
//		System.out.println("123 " + b.matches("[0-9]+"));
//		System.out.println("abcd " + c.matches("[0-9]+"));
//		System.out.println("123-456 " + d.matches("[0-9]+"));
//		
//		
//		try {
//	        Integer.valueOf(a);
//	        System.out.println(a);
//	    } catch (Exception e) {
//	        System.out.println("Número inválido 123a");
//	    }
//		
//		try {
//	        Integer.valueOf(b);
//	        System.out.println(b);
//	    } catch (Exception e) {
//	        System.out.println("Número inválido 123");
//	    }
//		
//		try {
//	        Integer.valueOf(c);
//	        System.out.println(a);
//	    } catch (Exception e) {
//	        System.out.println("Número inválido abcd");
//	    }
//		
//		try {
//	        Integer.valueOf(d);
//	        System.out.println(d);
//	    } catch (Exception e) {
//	        System.out.println("Número inválido 123-456");
//	    }
//		


