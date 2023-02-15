import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class List2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		int num;
		
		System.out.println("Digite um número: ");
		
		for (int contador = 0; contador <= 9; contador ++) {
			num = leia.nextInt();
			numeros.add(num);
		}
		
		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> lista = numeros.iterator();
		
		while(lista.hasNext()) {
			System.out.println(lista.next());
		}
		

		leia.close();
	}

}
