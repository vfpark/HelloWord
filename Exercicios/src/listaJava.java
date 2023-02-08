import java.util.Scanner;

public class listaJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float salario, abono, novoSalario;
		
		System.out.println("Digite o Salário: ");
		salario = sc.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = sc.nextFloat();

		novoSalario = salario + abono;
		System.out.println("O novo salário é: " + novoSalario);
		
		
	}

}
