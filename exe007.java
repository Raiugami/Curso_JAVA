import java.util.Scanner;

public class exe007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Informe um numero:");
		n1 = sc.nextInt();
		
		if (n1 >0) 
			System.out.println("Nâo negativo");
		else {
			System.out.println("Negativo");
		}
		sc.close();
	}

}
