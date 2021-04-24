package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exer03 {

	public static void main(String[] args) throws Exception {
		Lista<String> lista = new Lista<String>(10);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println("Lista: " + lista);
		
		lista.remove("A");
		System.out.println("Lista: " + lista);
		
		lista.remove("F");
		System.out.println("Lista: " + lista);
		
		lista.remove("C");
		System.out.println("Lista: " + lista);
	}
}
