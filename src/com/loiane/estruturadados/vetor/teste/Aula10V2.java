package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10V2 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "8899-7766", "c1@email.com");
		Contato c2 = new Contato("Contato 2", "8855-4433", "c2@email.com");
		Contato c3 = new Contato("Contato 3", "8812-2277", "c3@email.com");
		
		Contato c4 = new Contato("Contato 3", "8812-2277", "c3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		System.out.println("Vetor: " + vetor.toString());
		
		int pos = vetor.busca(c1);
		if(pos > -1){
			System.out.println("Elemento Existe no vetor");
		}else{
			System.out.println("Elemento não existe no vetor");
		}
		
		pos = vetor.busca(c4);
		if(pos > -1){
			System.out.println("Elemento Existe no vetor");
		}else{
			System.out.println("Elemento não existe no vetor");
		}
		
		//explicação para a saída acima
		
		/*	O objeto c4 não foi adicionado no array */
		
		/*	Apesar de ser uma instância diferente dos 
			demais objetos, os valores de seus atributos são iguais aos do objeto c3 */
		
		/*	Como o método equals() foi implementado na classe Contato, ao analisar se
			o objeto c4 existe na lista, o retorno será true, pois o equals() estará 
			considerando também os valores dos atributos do objeto (e não apenas a referência)*/
	}
}
