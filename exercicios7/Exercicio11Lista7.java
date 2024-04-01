package exercicios7;

import java.util.Scanner;

public class Exercicio11Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade (em Kg) de morangos:");
		double morangos = sc.nextDouble();

		System.out.println("Digite a quantidade (em Kg) de maçãs:");
		double maça = sc.nextDouble();

		double preço_do_morango;
		double preço_maça;

		if (morangos <= 5) {
			preço_do_morango = 2.50;
		} else {
			preço_do_morango = 2.20;
		}

		if (maça <= 5) {
			preço_maça = 1.80;
		} else {
			preço_maça = 1.50;
		}

		double quantidade_morangos = morangos * preço_do_morango;
		double quantidade_maças = maça * preço_maça;

		double preço_total = quantidade_morangos + quantidade_maças;

		if (morangos + maça > 8 || preço_total > 25.00) {
			preço_total *= 0.90;
		}

		System.out.println("Total a ser pago: R$" + preço_total);

		sc.close();
	}
}
