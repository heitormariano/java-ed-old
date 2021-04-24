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
			System.out.println("O elemento n�o existe");
		}
		
		int posB = arrayList.indexOf("B");
		int posC = arrayList.indexOf("C");
		
		System.out.println("�ndice do elemento B: " + posB);
		System.out.println("�ndice do elemento C: " + posC);
		
		int pos = arrayList.indexOf("D");
		if(pos > -1){
			System.out.println("Elemento D existe. Posica��o retornada: " + pos);
		}else{
			System.out.println("Elemento D n�o existe. Posi��o retornada: " + pos);
		}
		
		System.out.println("Elemento no �ndice 0: " + arrayList.get(0));
		System.out.println("Elemento no �ndice 2: " + arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		System.out.println("Tamanho: " + arrayList.size());
		
	}
}
