package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11V2 {

	public static void main(String[] args) {
		Lista<String> vetor = new Lista<String>(2);
		
		vetor.adiciona("Elemento01");
		vetor.adiciona("Elemento02");
		
		System.out.println("Vetor:" + vetor.toString());
		
		Lista<Contato> vetorContatos = new Lista<>(2);
		
		Contato c1 = new Contato("Contato 1", "8899-7766", "c1@email.com");
		Contato c2 = new Contato("Contato 2", "8855-4433", "c2@email.com");
		
		
		vetorContatos.adiciona(c1);
		vetorContatos.adiciona(c2);
		
		System.out.println("Vetor Contatos: " + vetorContatos.toString());
	}
}
