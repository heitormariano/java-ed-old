package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(2);
		
		//o vetor está permitindo adicionar elementos de tipos de diferentes
		// O vetor (array) deve guardar elementos do mesmo tipo
		vetor.adiciona(1);
		vetor.adiciona("Elemento String");
		
		System.out.println(vetor.toString());
	}
}
