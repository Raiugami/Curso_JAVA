import java.util.Locale;
import java.util.Scanner;

import entities.Calculador;

public class exe016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculador x;
		
		x = new Calculador();
		
		
		System.out.println("Informe o primeiro numero: ");
		x.a = sc.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		x.b = sc.nextInt();
				
		int soma = x.soma();
		System.out.println(soma);
		
		int subt = x.subt();
		System.out.println(subt);
		
		double div = x.divi();
		System.out.printf("%.2f%n",div);
		
		int multi = x.multi();
		System.out.println(multi);
		
		sc.close();
	}

}
