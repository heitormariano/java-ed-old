package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("Elemento 02");
		vetor.adiciona("Elemento 03");

		int posElem01 = vetor.busca("Elemento 01");

		if (posElem01 >= 0) {
			System.out.println("Elemento existe. Posição: " + posElem01);
		} else {
			System.out.println("Elemento não existe. Retorno: " + posElem01);
		}
		
		int posElem04 = vetor.busca("Elemento 04");

		if (posElem04 >= 0) {
			System.out.println("Elemento existe. Posição: " + posElem04);
		} else {
			System.out.println("Elemento não existe. Retorno: " + posElem04);
		}
	}
}
