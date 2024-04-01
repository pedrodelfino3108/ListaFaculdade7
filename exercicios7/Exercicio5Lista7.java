package exercicios7;

import java.util.Scanner;

public class Exercicio5Lista7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();
        
        System.out.println("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();
        
        System.out.println("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();
        
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }
        
        sc.close();
	}
}
