import java.util.Scanner;

public class exe002 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n1,n2,soma;

	n1 = sc.nextInt();

	n2 = sc.nextInt();
	
	soma = n1 + n2;
	
	System.out.printf("A soma dos valores equivale a: %d", soma);
	
	sc.close();
	
	
}
}