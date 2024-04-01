package exercicios7;

import java.util.Scanner;

public class Exercicio13Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a descrição do produto:");
		String descricao = sc.nextLine();

		System.out.println("Digite a quantidade adquirida:");
		int quantidade = sc.nextInt();

		System.out.println("Digite o preço unitário:");
		double unidade = sc.nextDouble();

		double total = quantidade * unidade;

		double desconto;
		if (quantidade <= 5) {
			desconto = total * 0.02;
		} else if (quantidade <= 10) {
			desconto = total * 0.03;
		} else {
			desconto = total * 0.05;
		}

		double valor_com_desconto = total - desconto;

		System.out.println("Descrição do produto: " + descricao);
		System.out.println("Total: R$" + total);
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Total a pagar: R$" + valor_com_desconto);

		sc.close();

	}
}
