import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class exe0017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo x;
		
		x = new Retangulo ();
		
		System.out.println("Informe Width: ");
		x.width = sc.nextDouble();
		System.out.println("Informe Height");
		x.height = sc.nextDouble();
		
		System.out.println(x.area());
		System.out.println(x.perimeter());
		System.out.println(x.diagonal());
		
		sc.close();
		

	}

}
