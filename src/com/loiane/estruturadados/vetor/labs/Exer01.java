package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println("Cont�m A? " + lista.contem("A"));
		System.out.println("Cont�m B? " + lista.contem("B"));
		System.out.println("Cont�m E? " + lista.contem("E"));
	}
}
