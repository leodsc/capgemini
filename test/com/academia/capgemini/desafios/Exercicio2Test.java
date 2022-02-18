package com.academia.capgemini.desafios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.academia.capgemini.desafio.Exercicio2;

public class Exercicio2Test {
	private Exercicio2 ex2 = new Exercicio2();
	
	@Test
	public void senhaSemCaracteres() {
		assertEquals(6, ex2.calcularForca(""));
	}

	@Test
	public void senhaComUmCaracterCumprindoUmRequisito() {
		assertEquals(5, ex2.calcularForca("a"));
	}

	@Test
	public void senhaComDoisCaracteresCumprindoUmRequisito() {
		assertEquals(4, ex2.calcularForca("aa"));
	}

	@Test
	public void senhaComTresCaracteresCumprindoUmRequisito() {
		assertEquals(3, ex2.calcularForca("aaa"));
	}

	@Test
	public void senhaComQuatroCaracteresCumprindoUmRequisito() {
		assertEquals(3, ex2.calcularForca("aaaa"));
	}

	@Test
	public void senhaComCincoCaracteresCumprindoUmRequisito() {
		assertEquals(3, ex2.calcularForca("aaaaa"));
	}

	@Test
	public void senhaComSeisCaracteresCumprindoUmRequisito() {
		assertEquals(3, ex2.calcularForca("aaaaaa"));
	}
	
	@Test
	public void senhaComDoisCaracteresCumprindoDoisRequisitos() {
		assertEquals(4, ex2.calcularForca("a!"));
	}

	@Test
	public void senhaComTresCaracteresCumprindoDoisRequisitos() {
		assertEquals(3, ex2.calcularForca("aa!"));
	}

	@Test
	public void senhaComQuatroCaracteresCumprindoDoisRequisitos() {
		assertEquals(2, ex2.calcularForca("aaa!"));
	}

	@Test
	public void senhaComCincoCaracteresCumprindoDoisRequisitos() {
		assertEquals(2, ex2.calcularForca("aaaa!"));
	}

	@Test
	public void senhaComSeisCaracteresCumprindoDoisRequisitos() {
		assertEquals(2, ex2.calcularForca("aaaaa!"));
	}

	@Test
	public void senhaComTresCaracteresCumprindoTresRequisitos() {
		assertEquals(3, ex2.calcularForca("a3!"));
	}

	@Test
	public void senhaComQuatroCaracteresCumprindoTresRequisitos() {
		assertEquals(2, ex2.calcularForca("a3!a"));
	}

	@Test
	public void senhaComCincoCaracteresCumprindoTresRequisitos() {
		assertEquals(1, ex2.calcularForca("a3!aa"));
	}

	@Test
	public void senhaComSeisCaracteresCumprindoTresRequisitos() {
		assertEquals(1, ex2.calcularForca("a3!aaa"));
	}
	
	@Test
	public void senhaComQuatroCaracteresCumprindoQuatroRequisitos() {
		assertEquals(2, ex2.calcularForca("a3!A"));
	}

	@Test
	public void senhaComCincoCaracteresCumprindoQuatroRequisitos() {
		assertEquals(1, ex2.calcularForca("a3!Aa"));
	}

	@Test
	public void senhaComSeisCaracteresCumprindoQuatroRequisitos() {
		assertEquals(0, ex2.calcularForca("a3!Aaa"));
	}

}
