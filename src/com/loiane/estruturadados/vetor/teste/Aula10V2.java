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
			System.out.println("Elemento n�o existe no vetor");
		}
		
		pos = vetor.busca(c4);
		if(pos > -1){
			System.out.println("Elemento Existe no vetor");
		}else{
			System.out.println("Elemento n�o existe no vetor");
		}
		
		//explica��o para a sa�da acima
		
		/*	O objeto c4 n�o foi adicionado no array */
		
		/*	Apesar de ser uma inst�ncia diferente dos 
			demais objetos, os valores de seus atributos s�o iguais aos do objeto c3 */
		
		/*	Como o m�todo equals() foi implementado na classe Contato, ao analisar se
			o objeto c4 existe na lista, o retorno ser� true, pois o equals() estar� 
			considerando tamb�m os valores dos atributos do objeto (e n�o apenas a refer�ncia)*/
	}
}
