package com.academia.capgemini.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio2 {
	private Scanner sc = new Scanner(System.in);
	// armazena informações sobre quais requisoções minimas a senha cumpre
	private Map<String, Integer> senhaForca = new HashMap<String, Integer>();
	/* patterns para verificar se a senha tem no mínimo:
	  • 1 dígito
	  • 1 letra minúscula
	  • 1 letra maiuscula
	  • 1 caracter especial
	*/ 
	private String[] patterns = {"\\d", "[a-z]", 
	                             "[A-Z]", "[!@#\\$%\\^\\&*\\(\\)\\-\\+]"};
	public void iniciar() {
    System.out.printf("Digite a senha: ");
		String senha = sc.nextLine();
		int forca = calcularForca(senha);
		System.out.println(forca);
	}
	
	

	public int calcularForca(String senha) {
		// adiciona os 
		construirHashMap();
		String[] senhaArray = senha.split("");
		int totalForca = 0;
		
    // valida cada caracter de forma independente
		for (String caracter: senhaArray) {
			validar(caracter);
		}
		
		for (int valor: senhaForca.values()){
			if (valor > 0) {
				totalForca++;
			}
		}
		
		int caracteresTotaisFaltantes = 6-senha.length();
		int caracteresRequisitadosFaltantes = 4-totalForca;
		
		if (caracteresTotaisFaltantes > caracteresRequisitadosFaltantes) {
			return 6-senha.length();
		} else {
			return 4-totalForca;
		}
	}
	
	/*
	 constrói um hashmap que armazena as requisições mínimas para que
	 uma senha seja considerada forte, ou seja, se tem no mínimo um digito,
	 uma letra minuscula, uma maiscula e um caracter especial 
	 */
	private void construirHashMap() {
		senhaForca.put("digito", 0);
		senhaForca.put("maiusculo", 0);
		senhaForca.put("minusculo", 0);
		senhaForca.put("especial", 0);
	}


	// verifica se o caracter é um especial ou não
	public void validar(String caracter) {
		for (int i = 0; i < patterns.length; i++) {
			// cria pattern para cada caracter especial definido em patterns 
			Pattern pattern = Pattern.compile(patterns[i]);
			Matcher matcher = pattern.matcher(caracter);
			// caso seja um dos caracteres especiais, aumenta seu valor no hashmap
			// de acordo com o seu tipo
			if (matcher.find()) {
				switch (i) {
				case 0:
					incrementarHashMap("digito");
					break;
				case 1:
					incrementarHashMap("minusculo");
					break;
				case 2:
					incrementarHashMap("maiusculo");
					break;
				case 3:
					incrementarHashMap("especial");
					break;
				}
				break;
			}
		}
	}
	// adiciona mais um ponto no hashmap caso caracter seja um dos padrões pedidos na senha
	public void incrementarHashMap(String chave) {
		int valor = senhaForca.get(chave);
		valor++;
		senhaForca.put(chave, valor);
	}
}
