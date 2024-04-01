package exercicios7;

import java.util.Scanner;

public class Exercicio9Lista7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double alcool = 2.90;
        double gasolina = 3.30;

        System.out.println("Digite o número de litros vendidos:");
        double litrosVendidos = sc.nextDouble();

        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina):");
        String combustivel = sc.next();

        double desconto_por_litro = 0;
        if (combustivel.equalsIgnoreCase("A")) {
            if (litrosVendidos <= 20) {
            	desconto_por_litro = 0.03;
            } else {
            	desconto_por_litro = 0.05;
            }
            double desconto = litrosVendidos * alcool * desconto_por_litro;
            double total = litrosVendidos * alcool - desconto;
            System.out.println("Valor a ser pago pelo cliente: R$" + total);
        } else if (combustivel.equalsIgnoreCase("G")) {
            if (litrosVendidos <= 20) {
                desconto_por_litro = 0.04;
            } else {
            	desconto_por_litro = 0.06;
            }
            double valorDesconto = litrosVendidos * gasolina * desconto_por_litro;
            double valorTotal = litrosVendidos * gasolina - valorDesconto;
            System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);
        } else {
            System.out.println("Tipo de combustível inválido. Por favor, digite 'A' para álcool ou 'G' para gasolina.");
        }

        sc.close();
	}
	
}
