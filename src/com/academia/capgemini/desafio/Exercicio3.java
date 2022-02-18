package com.academia.capgemini.desafio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercicio3 {
	private String palavra;
	private Scanner sc = new Scanner(System.in);
	private int totalAnagramas = 0;
	// permutação de todas as letras da palavra fornecida
	ArrayList<String> subPalavras = new ArrayList<String>();
	ArrayList<Integer> pontuacoes = new ArrayList<Integer>();
	String[] palavraArray;
	
	public int iniciar() {
    System.out.println("Digite a palavra: ");
		palavra = sc.nextLine();
		palavraArray = palavra.split("");
		gerarSubPalavras();
		gerarPontuacao();
		acharPares();
		sc.close();

		return totalAnagramas;
	}
	
	// apenas para testes no Junit
	public int iniciar(String palavra) {
		this.palavra = palavra;
		palavraArray = this.palavra.split("");
		gerarSubPalavras();
		gerarPontuacao();
		acharPares();
		return totalAnagramas;
	}
	
	// gera a permutação da palavra fornecida
	private void gerarSubPalavras() {
		// gera todas as sub palavras possiveis com a palavra fornecida
		for (int i = 0; i < palavraArray.length; i++) {
			for (int j = i; j < palavraArray.length; j++) {
				String subString = palavra.substring(i, j+1);
				subPalavras.add(subString);
			}
		}
	}
	
	/*
	 * cria uma pontuação para cada permutação, sendo que essa pontuação é
	 * gerada por meio da tabela ASCII
	 */
	private void gerarPontuacao() {
		for (String letras: subPalavras) {
			String subPalavra = letras;
			char[] subPalavraArray = subPalavra.toCharArray();
			int pontuacao = 0;
			for (char sub: subPalavraArray) {
				pontuacao += (int) sub;
			}
			pontuacoes.add(pontuacao);
		}
	}
	
	// um par é achado caso exista, dentro do array de pontuações, duas que sejam iguais
	// sinalizando de que são pares de anagramas
	private void acharPares() {
		for (int i = 0; i < pontuacoes.size(); i++) {
			for (int j = i+1; j < pontuacoes.size(); j++) {
				if (pontuacoes.get(i).equals(pontuacoes.get(j))) {
					totalAnagramas++;
					break;
				}
			}
		}
	}
}
