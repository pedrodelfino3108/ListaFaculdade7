package exercicios7;

import java.util.Scanner;

public class Exercicio14Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextDouble();

		System.out.println("Digite a média dos exercícios:");
		double exercicios = sc.nextDouble();

		double aproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + exercicios) / 7;

		String conceito;
		if (aproveitamento >= 9.0) {
			conceito = "A";
		} else if (aproveitamento >= 7.5) {
			conceito = "B";
		} else if (aproveitamento >= 6.0) {
			conceito = "C";
		} else if (aproveitamento >= 4.0) {
			conceito = "D";
		} else {
			conceito = "E";
		}

		System.out.println("Média de aproveitamento: " + aproveitamento);
		System.out.println("Conceito: " + conceito);

		sc.close();
	}
}
