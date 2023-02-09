import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int idade;
		boolean doacao;
		String nome;
		
		System.out.println("Digite o nome do doador: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = sc.nextInt ();
		
		System.out.println("Primeira doação de sangue? ");
		doacao = sc.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
		System.out.println(nome + " não está apto(a) para doar sangue.");
		}
		
		else if (idade > 60 && doacao == false){
			System.out.println(nome + " está apto(a) para doar sangue!");
		}
		
		else
			System.out.println(nome + " não está apto(a) para doar sangue.");
		
	}
}

