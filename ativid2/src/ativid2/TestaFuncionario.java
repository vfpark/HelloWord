package ativid2;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Funcionario f1 = new Funcionario ("Maria", "Recursos Humanos", "Diurno", "São Paulo", 777777);
		f1.visualizar();
		
		Funcionario f2 = new Funcionario ("José", "Logística", "Noturno", "São Paulo", 888888);
		f2.visualizar();
		
		leia.close();

	}

}
