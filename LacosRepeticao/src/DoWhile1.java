import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero = 0, positivos = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0)
			{ 
				positivos += numero;				
			}		
		} while (numero != 0); 		
		System.out.println("A soma dos números positivos é: " + positivos);
		
		leia.close();
	}

}
