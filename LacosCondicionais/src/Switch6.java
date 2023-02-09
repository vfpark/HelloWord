import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int codigo, cargo;
		float salario;
		String nome;
		
		System.out.println("Digite o nome do colaborador: ");
		nome = sc.nextLine();
		
		System.out.println("Digite código do cargo: ");
		cargo = sc.nextInt();
		
		System.out.println("Digite o salário: ");
		salario = sc.nextFloat();
		
		switch (cargo) {
		case 1: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: " + (1.1 * salario));
		break;
		
		case 2: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: " + (1.07 * salario));
			break;
		
		case 3: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário: " + (1.09 * salario));
			break;
		
		case 4: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: " + (1.06 * salario));
			break;
		
		case 5: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: " + (1.05 * salario));
			break;
		
		case 6: 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário: " + (1.08 * salario));
			break;
			
		}
		
		
	}

}
