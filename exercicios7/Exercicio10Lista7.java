package exercicios7;

import java.util.Scanner;

public class Exercicio10Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do primeiro homem:");
		int homem1 = sc.nextInt();

		System.out.println("Digite a idade do segundo homem:");
		int homem2 = sc.nextInt();

		System.out.println("Digite a idade da primeira mulher:");
		int mulher1 = sc.nextInt();

		System.out.println("Digite a idade da segunda mulher:");
		int mulher2 = sc.nextInt();

		int homem_velho = Math.max(homem1, homem2);

		int homem_novo = Math.min(homem1, homem2);

		int mulher_velha = Math.max(mulher1, mulher2);

		int mulher_nova = Math.min(mulher1, mulher2);

		int soma_das_idades = homem_velho + mulher_nova;

		int produtoIdades = homem_novo * mulher_velha;

		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma_das_idades);
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);

		sc.close();
	}
}
