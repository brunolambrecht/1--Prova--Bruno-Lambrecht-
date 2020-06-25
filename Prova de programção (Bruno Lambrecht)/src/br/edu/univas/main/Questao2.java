package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidade = 100;
		int sim = 0, nao = 0, sul = 0, sudeste = 0, centroeste = 0, norte = 0, nordeste = 0, votosSim = 0, votosNao = 0;

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			int resposta = sc.nextInt();

			if (resposta == 1)
				votosSim++;
			else if (resposta == 2) {
				votosNao++;
			}

			System.out.println("Qual região do Brasil você mora? ");
			System.out.println("1 - Sul");
			System.out.println("2 - Sudeste");
			System.out.println("3 - Centro-Oeste");
			System.out.println("4 - Norte");
			System.out.println("5 - Nordeste");
			int regiao = sc.nextInt();

			if (regiao == 1) {
				sul++;
			} else if (regiao == 2) {
				sudeste++;
			} else if (regiao == 3) {
				centroeste++;
			} else if (regiao == 4) {
				norte++;
			} else if (regiao == 5) {
				nordeste++;
			}
		}
		sc.close();

		System.out.println("Quantidade de pessoas que votaram SIM: " + votosSim);
		System.out.println("Quantidade de pessoas que votaram NÃO: " + votosNao);
		System.out.println("Votos por região: ");
		System.out.println("Sul: " + sul);
		System.out.println("Sudeste: " + sudeste);
		System.out.println("Centro-Oeste: " + centroeste);
		System.out.println("Norte: " + norte);
		System.out.println("Nordeste: " + nordeste);
	}

}
