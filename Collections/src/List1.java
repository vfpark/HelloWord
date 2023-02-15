import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;
		
		System.out.println("Digite as cores: ");
		
		for (int contador = 0; contador <= 4; contador ++) {	
			cor = leia.nextLine();	
			cores.add(cor);	
		}
		
		System.out.println("\nListar todas as cores: ");
		cores.forEach(System.out::println);
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		cores.forEach(System.out::println);
		
		
		leia.close();
	}

}
