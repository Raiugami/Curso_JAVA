import java.util.Scanner;

public class exe008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1;
		
		System.out.println("informe um numero: ");
		n1 = sc.nextInt();
		
		if (n1 % 2 == 0) 
			System.out.println("PAR");
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
