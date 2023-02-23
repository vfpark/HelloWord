package ativid2;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Funcionario f1 = new Funcionario ("Maria dos Santos", "Recursos Humanos", "Diurno", "São Paulo", 777777);
		f1.visualizar();
		
		Funcionario f2 = new Funcionario ("José Pereira", "Logística", "Noturno", "São Paulo", 888888);
		f2.visualizar();
		
		Gerente g1 = new Gerente ("Paulo Barros", "Engenharia de Software", "Diurno", "Minas Gerais", 333333, 4);
		g1.visualizar();
		
		Gerente g2 = new Gerente ("Fernanda Melo", "Customer Sucess", "Diurno", "São Paulo", 222222, 6);
		g2.visualizar();
		
		Vendedor v1 = new Vendedor ("Bianca de Sá", "Vendas", "Diurno", "São Paulo", 444444, "Sim");
		v1.visualizar();
		
		Vendedor v2 = new Vendedor ("Daniela Andrade", "Vendas", "Diurno", "São Paulo", 555555, "Não");
		v2.visualizar();
		
		leia.close();

	}

}
