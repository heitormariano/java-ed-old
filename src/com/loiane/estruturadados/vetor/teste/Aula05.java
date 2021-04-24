package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1"); // 0
		vetor.adiciona("Elemento 2"); // 1
		vetor.adiciona("Elemento 3"); // 2

		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(2));
		
		//posições inválidas
		/*System.out.println(vetor.busca(-2));
		System.out.println(vetor.busca(3));*/
	}
}
