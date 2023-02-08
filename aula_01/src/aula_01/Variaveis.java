package aula_01;

import java.text.DecimalFormat;

public class Variaveis {

	public static void main (String [] args) {
		
		DecimalFormat df = new DecimalFormat ("###.##");
		
		int numero = 10;
		String nome = "Vitoria Busch";
		double area = 45.639874521;
		
		System.out.println("O nome da participante é: " + nome);
		System.out.println("O número é: " + numero);
		System.out.printf("O número é: %.2f", area);
		
		System.out.println("O número é: " + df.format(area));
		
	}
}
