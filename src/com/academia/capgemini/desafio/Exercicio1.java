package com.academia.capgemini.desafio;

import java.util.Scanner;

public class Exercicio1 {
	private Scanner sc = new Scanner(System.in);
	private String estrela = "*";

	// inicia a aplicação
	public void iniciar() {
		System.out.printf("n=");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			/*
				na iteração i, adiciona um espaço de n-i-1 antes da estrela
				para que a "escada" fique do lado direito e conforme
				esse algoritmo avance, o espaço diminua pela adição de uma nova estrela
			 */
			String espacos = " ".repeat(n-i-1);
			System.out.println(espacos+estrela);
			estrela += "*";
		}

		sc.close();
	}
}
