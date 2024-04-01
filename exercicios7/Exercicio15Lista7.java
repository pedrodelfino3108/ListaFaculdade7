package exercicios7;

import java.util.Scanner;

public class Exercicio15Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do empregado (código):");
		int codigo_empregado = sc.nextInt();

		System.out.println("Digite o ano de nascimento do empregado:");
		int ano_do_nascimento = sc.nextInt();

		System.out.println("Digite o ano de ingresso na empresa:");
		int entrada = sc.nextInt();

		int idade = 2024 - ano_do_nascimento;

		int tempo_de_trabalho = 2024 - entrada;

		if (idade >= 65 || tempo_de_trabalho >= 30 || (idade >= 60 && tempo_de_trabalho >= 25)) {
			System.out.println("Idade: " + idade + " anos");
			System.out.println("Tempo de trabalho: " + tempo_de_trabalho + " anos");
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Idade: " + idade + " anos");
			System.out.println("Tempo de trabalho: " + tempo_de_trabalho + " anos");
			System.out.println("Não requerer");
		}

		sc.close();
	}
}
