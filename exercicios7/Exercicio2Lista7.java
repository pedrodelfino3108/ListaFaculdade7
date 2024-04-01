package exercicios7;

import java.util.Scanner;

public class Exercicio2Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();

		System.out.print("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		double valor3 = sc.nextDouble();

		double maiorValor = valor1;

		if (valor2 > maiorValor) {
			maiorValor = valor2;
		}

		if (valor3 > maiorValor) {
			maiorValor = valor3;
		}

		System.out.println("O maior valor é: " + maiorValor);

		sc.close();
	}
}
