import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("DIGITE UM NUMERO: ");
		N = sc.nextInt();
		
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}

	
}
