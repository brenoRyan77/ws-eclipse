import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, nump1, nump2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		nump1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		nump2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1 * nump1 + preco2 * nump2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total);
		sc.close();

	}

}
