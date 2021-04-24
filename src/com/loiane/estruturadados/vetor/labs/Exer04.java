package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exer04 {

	public static void main(String[] args) throws Exception {
		Lista<String> lista = new Lista<String>(10);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println("Elemendo de índice 0 : " + lista.obtem(0));
		System.out.println("Elemendo de índice 2 : " + lista.obtem(2));
		System.out.println("Elemendo de índice 4 : " + lista.obtem(4));
	}
}
