import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a, b, c, soma;
		
		System.out.println("Digite o número A: ");
		a = sc.nextInt ();
		
		System.out.println("Digite o número B: ");
		b = sc.nextInt ();
		
		System.out.println("Digite o número C: ");
		c = sc.nextInt ();
		
		soma = a + b;
		
		if (soma > c){
		System.out.println(a + " + " + b + " = " + soma + " > " + c);
		System.out.println("A soma de A + B é maior do que C. ");
		
		}
		else if (soma < c){
			System.out.println(a + " + " + b + " = " + soma + " < " + c);
			System.out.println("A soma de A + B é menor do que C. ");
		}
		
		else if (soma == c){
			System.out.println(a + " + " + b + " = " + soma + " = " + c);
			System.out.println("A soma de A + B é igual a C. ");
		}
		
	}

}
