package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		System.out.println("Último indíce para o elemento C: " + arrayList.lastIndexOf("C"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("A");
		lista.adiciona("B");
		
		System.out.println("Último índice para o elemento A: " + lista.ultimoIndice("A"));
		System.out.println("Último índice para o elemento B: " + lista.ultimoIndice("B"));
		
	}
}
