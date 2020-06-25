package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int numero = sc.nextInt();

		if (numero % 5 == 4) {
			System.out.println("O numero arredondado é: " + (numero + 1));

		} else if (numero % 5 == 3) {
			
			System.out.println("O numero arredondado é: " + (numero + 2));

		} else
			System.out.println(numero + " não aredonda!");
	}

}
