import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Breno";
		int idade = 20;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, renda);

	}

}
