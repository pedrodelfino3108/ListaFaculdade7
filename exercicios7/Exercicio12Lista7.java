package exercicios7;

import java.util.Scanner;

public class Exercicio12Lista7 {
	public static void main(String[] args) {
		final int user_correto = 1234;
		final int senha_correta = 9999;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o código de usuário:");
		int user = scanner.nextInt();

		if (user != user_correto) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println("Digite a senha:");
			int senha = scanner.nextInt();

			if (senha != senha_correta) {
				System.out.println("Senha incorreta!");
			} else {
				System.out.println("Acesso permitido!");
			}
		}

		scanner.close();
	}

}
