import java.util.Locale;
import java.util.Scanner;

public class exe005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero, salario, horas, shora;
		
		numero = sc.nextFloat();
		horas = sc.nextFloat();
		
		shora = sc.nextFloat();
		
		salario = shora * horas;
		
		System.out.printf("Number: %.0f%n", numero);
		System.out.printf("Salary: U$%.2f", salario);

		sc.close();
	}

}
