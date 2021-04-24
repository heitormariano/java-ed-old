package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe){
			System.out.println("O elemento existe");
		}else{
			System.out.println("O elemento não existe");
		}
		
		int posB = arrayList.indexOf("B");
		int posC = arrayList.indexOf("C");
		
		System.out.println("Índice do elemento B: " + posB);
		System.out.println("Índice do elemento C: " + posC);
		
		int pos = arrayList.indexOf("D");
		if(pos > -1){
			System.out.println("Elemento D existe. Posicação retornada: " + pos);
		}else{
			System.out.println("Elemento D não existe. Posição retornada: " + pos);
		}
		
		System.out.println("Elemento no índice 0: " + arrayList.get(0));
		System.out.println("Elemento no índice 2: " + arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println("Tamanho: " + arrayList.size());
		
	}
}
