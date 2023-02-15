import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> livros = new Stack<String>();
		
		int opcao = 6;
		String nome;
		
		do {
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				livros.push(nome);
				livros.forEach(System.out::println);	
				System.out.println("Pilha: ");
				System.out.println("Livro adicionado!");
				break;
			
			case 2:
				System.out.println("Lista de livros na pilha: ");
				livros.forEach(System.out::println);
				break;
				
			case 3:
				if (!livros.isEmpty()) {
					System.out.println("Pilha: ");
					System.out.println(livros.pop());
					System.out.println("Um livro foi retirado da pilha");
				}else System.out.println("A Pilha está vazia!");
				break;
				
			default:
				System.out.println("Programa finalizado!");
			}
			
			
		} while(opcao != 0);
				
		leia.close();

	}

}
