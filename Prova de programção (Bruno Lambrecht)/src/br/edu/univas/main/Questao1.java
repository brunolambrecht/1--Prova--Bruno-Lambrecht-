package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float numero;
		int cont = 0;

		do {

			System.out.println("Digite os numeros");
			numero = sc.nextFloat();

			if (numero < 0) {
				cont++;
			} else if (numero == 0) {
				break;
			}

		} while (true);
		System.out.println("Numeros negativos: " + cont);
	}

}
