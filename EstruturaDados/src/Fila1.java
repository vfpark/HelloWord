import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> nomes = new LinkedList<String>();
		
		int opcao = 6;
		String nome;
		
		do {
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				nomes.add(nome);
				nomes.forEach(System.out::println);	
				System.out.println("Fila: ");
				System.out.println("Cliente adicionado!");	
				break;
				
			case 2: 
				System.out.println("Lista de clientes na fila: ");
				nomes.forEach(System.out::println);
				break;	
				
			case 3: 
				if (!nomes.isEmpty()) {
					System.out.println("Fila: ");
					System.out.println(nomes.poll());
					System.out.println("O cliente foi chamado!");
				}else System.out.println("A Fila está vazia!");
				break;		
				
			default:
				System.out.println("Programa finalizado!");
			}
					
		}while(opcao != 0);
		
		
		leia.close();
	}

}
