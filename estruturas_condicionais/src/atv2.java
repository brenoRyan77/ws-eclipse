import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		System.out.println("DIGITE UM VALOR: ");
		N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
