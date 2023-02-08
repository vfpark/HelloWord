import java.util.Scanner;

public class listaJava2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira a nota 1: ");
		nota1 = sc.nextFloat();
		System.out.println("Insira a nota 2: ");
		nota2 = sc.nextFloat();
		System.out.println("Insira a nota 3: ");
		nota3 = sc.nextFloat();
		System.out.println("Insira a nota 4: ");
		nota4 = sc.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média fianal é: " + media);
		

	}

}
