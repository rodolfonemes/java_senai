package br.senai.sp.informatica.exercicios;
// este programa vai calcular o valor do salario liquido 
import javax.swing.JOptionPane;

public class salarioLiquido {
	public static void main(String[] args) {
		
		Double horasTrabalhadas; // variavel que vai armazenar a quantidade de horas trabalhadas
		Double salarioHoras;     // variavel que vai armazenar a quantidade de horas trabalhadas
		int numeroDependentes;   // variavel que vai armazenar a quantidade de horas trabalhadas
		
		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas"));
		salarioHoras = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario/hora"));
		numeroDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe o numeros de dependentes"));
		
		double salarioBruto = horasTrabalhadas * salarioHoras + 50 * numeroDependentes;	
		double inss;
		if(salarioBruto <=1000) {
		inss = salarioBruto * 8.5 / 100;		
		}else {
			inss = salarioBruto * 9 / 100;	
		}
		double IR;
		if(salarioBruto <=500) {
			IR=0;		
			}else if(salarioBruto <=1000){
				IR = salarioBruto * 5 / 100;	
			}else{
				IR = salarioBruto * 7 / 100;	
			}
		double salarioLiquido = salarioBruto - inss - IR;
		
		JOptionPane.showMessageDialog(null, 
				"salario horas: "+ salarioHoras + "\n" +
		        "numeros de horas: " + horasTrabalhadas + "\n" + 
				"numeros de dependentes " + numeroDependentes + "\n" +
				"salario Bruto: "+ salarioBruto + "\n" +
		        "valor inss: " + inss + "\n" + 
				"valor IR " + IR + "\n" +
		        "salario Liquido: " + salarioLiquido
				);
	}

}
