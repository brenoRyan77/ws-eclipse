package entrada_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			//String x;
			//int x;
			//double x;
			//char x;
			
			String x;
			int y;
			double z;
			
			//x = sc.next();
			//x = sc.nextInt();
			//x = sc.nextDouble();
			//x = sc.next().charAt(3);
			x = sc.next();
			y = sc.nextInt();
			z = sc.nextDouble();
			
			System.out.println("Dados digitados: ");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
			
			
			
			sc.close();

	}

}
