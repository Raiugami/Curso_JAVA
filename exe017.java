import java.util.Locale;
import java.util.Scanner;

import entities.ConversaoDolar;

public class exe017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do dolar:");
		double valorDolar = sc.nextDouble();
		System.out.println("Informe o valor que deseja converter:");
		double valorConverter = sc.nextDouble();
		
		System.out.printf("%.2f",ConversaoDolar.Conversao(valorDolar, valorConverter));
		
		
		
	sc.close();
		
	}

}
