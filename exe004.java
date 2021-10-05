import java.util.Scanner;

public class exe004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d, diff;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diff = a*b - c*d;
		
		System.out.printf("Diferença é: %d", diff);
		
		sc.close();
		
	}

}
