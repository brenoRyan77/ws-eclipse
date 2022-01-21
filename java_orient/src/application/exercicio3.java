package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos aluno = new Alunos();
		
		System.out.println("Nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Notas do aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.finalNota());
		
		if (aluno.finalNota() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING " + aluno.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		sc.close();
	}

}
