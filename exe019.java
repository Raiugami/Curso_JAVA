import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class exe019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe Width: ");
		double width = sc.nextDouble();
		System.out.println("Informe Height");
		double height = sc.nextDouble();
		
		System.out.println(Retangulo.area(width, height));
		System.out.println(Retangulo.perimeter(width, height));
		System.out.println(Retangulo.diagonal(width, height));
	
		sc.close();
		

	}

}
