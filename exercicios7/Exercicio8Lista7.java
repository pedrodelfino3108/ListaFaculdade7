package exercicios7;

import java.util.Scanner;

public class Exercicio8Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de x: ");
		double X = sc.nextDouble();

		System.out.print("Digite o valor de y: ");
		double Y = sc.nextDouble();

		double Z = (X * Y) + 5;

		String resposta;
		if (Z <= 0) {
			resposta = "A";
		} else if (Z <= 100) {
			resposta = "B";
		} else {
			resposta = "C";
		}
		System.out.println("z = " + Z);
		System.out.println("resposta = " + resposta);

		sc.close();
	}
}
