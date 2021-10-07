import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class exe018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		new Banco();
		
		System.out.println("Informe o numero da conta:");
		int numero = sc.nextInt();
		System.out.println("Informe o nome do dono:");
		String nome = sc.next();
		
		System.out.println("Deseja fazer um deposito inicial? (s/n)");
		String SN = sc.next();
		
	
		System.out.println("Informe o valor que deseja depositar: ");
		double depi = sc.nextDouble();
		double saldo = depi;
		System.out.printf("Conta %d, Nome: %s, saldo: $%.2f", numero, nome, saldo);
		
		
		System.out.println("Informe o valor do deposito: ");
		double dep = sc.nextDouble();
		System.out.printf("Conta %d, Nome: %s, saldo: $%.2f", numero, nome,)
		
	}

}
