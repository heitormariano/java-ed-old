package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(3);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");

		System.out.println(vetor.toString());
		
		vetor.remove(1); //remover "B"
		
		System.out.println(vetor.toString());
		System.out.println("Tamanho real do vetor: " + vetor.tamanho());
		
		vetor.remove("C");
		System.out.println(vetor.toString());
		System.out.println("Tamanho real do vetor: " + vetor.tamanho());
		
		vetor.remove("W"); //tentar remover elemento ("W") que não existe
		System.out.println(vetor.toString());
		System.out.println("Tamanho real do vetor: " + vetor.tamanho());
	}
}
