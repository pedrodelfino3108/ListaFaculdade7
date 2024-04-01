package exercicios7;

import java.util.Scanner;

public class Exercicio4Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();

		System.out.print("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		double valor3 = sc.nextDouble();

		double temp;
		if (valor1 > valor2) {
			temp = valor1;
			valor1 = valor2;
			valor2 = temp;
		}
		if (valor2 > valor3) {
			temp = valor2;
			valor2 = valor3;
			valor3 = temp;
		}
		if (valor1 > valor2) {
			temp = valor1;
			valor1 = valor2;
			valor2 = temp;
		}

		System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2 + ", " + valor3);

		sc.close();
	}
}
