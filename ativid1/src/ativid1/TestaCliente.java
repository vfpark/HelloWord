package ativid1;

import java.util.Scanner;

public class TestaCliente {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Cliente c1 = new Cliente ("João Pedro", 1, 222222222, 888888888, 12846985);
		c1.visualizar();
		
		Cliente c2 = new Cliente ("Beatriz Silva", 2, 333333333, 999999999, 54321004);
		c2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica ("Marcos Antônio", 3, 444444444, 777777777, 47565456, "Divorciado");
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica ("Aline Santos", 4, 666666666, 111111111, 652433587, "Solteira");
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica ("Dev Serviços", 5, 85462579, "LTDA");
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica ("J Company", 6, 54216987, "MEI");
		pj2.visualizar();
		
		leia.close();
	}

}
