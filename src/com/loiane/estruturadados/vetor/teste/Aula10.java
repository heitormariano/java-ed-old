package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args){
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		System.out.println("Vetor: " + vetor); // é chamado automaticamente o toString() da classe VetorObjetos
		System.out.println("Vetor: " + vetor.toString()); //chamando o toString() explicitamente
	}
}
