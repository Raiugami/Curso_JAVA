import java.util.Locale;
import java.util.Scanner;

import entities.Calculador;

public class exe016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int a = sc.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		int b = sc.nextInt();
				
		System.out.println(Calculador.soma(a, b));
		System.out.println(Calculador.subt(a, b));
		System.out.printf("%.2f%n",Calculador.divi(a, b));
		System.out.println(Calculador.multi(a, b));
		
		sc.close();
	}

}
