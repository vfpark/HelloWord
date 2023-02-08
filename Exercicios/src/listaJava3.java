import java.util.Scanner;

public class listaJava3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontosCo, salarioLiquido;
		
		System.out.println("Insira o Salário Bruto: ");
		salarioBruto = sc.nextFloat();
		System.out.println("Insira o Adicional Noturno: ");
		adicionalNoturno = sc.nextFloat();
		System.out.println("Insira as Horas Extras: ");
		horasExtras = sc.nextFloat();
		System.out.println("Insira os Descontos de um Colaborador: ");
		descontosCo = sc.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras * 5) - descontosCo;
		
		System.out.println("O salário líquido é de: " + salarioLiquido);
		
	}

}
