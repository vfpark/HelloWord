import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int item, quantidade;
		float total;
		
		System.out.println("Digite o número do item de 1 a 6: ");
		item = sc.nextInt();
		
		System.out.println("Qual a quantidade? ");
		quantidade= sc.nextInt();
		
		switch (item) {
		case 1: 
			System.out.println("Produto: Cachorro Quente");
			total = 10.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
			
		case 2: 
			System.out.println("Produto: X-Salada");
			total = 15.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 3: 
			System.out.println("Produto: X-Bacon");
			total = 18.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);;
		case 4: 
			System.out.println("Produto: Bauru");
			total = 12.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 5: 
			System.out.println("Produto: Refrigerante");
			total = 8.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 6: 
			System.out.println("Produto: Suco de laranja");
			total = 13.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
			
		}		
	}
}
