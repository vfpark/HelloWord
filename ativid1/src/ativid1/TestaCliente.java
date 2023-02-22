package ativid1;

import java.util.Scanner;

public class TestaCliente {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Cliente c1 = new Cliente ("João Pedro", 01, 222222222, 888888888, 12345);
		c1.visualizar();
		
		Cliente c2 = new Cliente ("Beatriz Silva", 02, 333333333, 999999999, 54321);
		c2.visualizar();
		
		leia.close();
	}

}
