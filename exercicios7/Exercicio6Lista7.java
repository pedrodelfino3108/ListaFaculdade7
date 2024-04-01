package exercicios7;

import java.util.Scanner;

public class Exercicio6Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do primeiro time: ");
		String time1 = sc.nextLine();
		System.out.print("Digite o número de gols marcados pelo " + time1 + ": ");
		int gols_time1 = sc.nextInt();

		System.out.print("Digite o nome do segundo time: ");
		sc.nextLine();
		String time2 = sc.nextLine();
		System.out.print("Digite o número de gols marcados pelo " + time2 + ": ");
		int gols_time2 = sc.nextInt();

		String vencedor;
		if (gols_time1 > gols_time2) {
			vencedor = time1;
		} else if (gols_time2 > gols_time1) {
			vencedor = time2;
		} else {
			vencedor = "EMPATE";
		}

		System.out.println("O vencedor é: " + vencedor);

		sc.close();
	}
}
