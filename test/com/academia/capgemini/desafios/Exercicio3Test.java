package com.academia.capgemini.desafios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.academia.capgemini.desafio.Exercicio3;

public class Exercicio3Test {
	private Exercicio3 ex3 = new Exercicio3();
	
	@Test
	public void testeComUmAnagrama() {
		assertEquals(1, ex3.iniciar("oo"));
	}

	@Test
	public void testeComDoisAnagramas() {
		assertEquals(2, ex3.iniciar("ovo"));
	}

	@Test
	public void testeComTresAnagramas() {
		assertEquals(3, ex3.iniciar("ifailuhkqq"));
	}
	
	@Test
	public void testeComQuatroAnagramas() {
		assertEquals(4, ex3.iniciar("affa"));
	}
	
	@Test
	public void testeComSeisAnagramas() {
		assertEquals(6, ex3.iniciar("babaa"));
	}
	
	@Test
	public void testeComSeteAnagramas() {
		assertEquals(7, ex3.iniciar("afbfba"));
	}
}
