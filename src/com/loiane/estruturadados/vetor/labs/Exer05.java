package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		
		System.out.println("ArrayList antes: " + arrayList);
		
		//a lista deve ser esvaziada primeiro
		arrayList.clear(); 
		
		System.out.println("ArrayList depois:" + arrayList);
		
		
		Lista<String> lista = new Lista<String>(10);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println("Lista antes : " + lista);
		
		lista.limpar();
		
		System.out.println("Lista depois " + lista);
	}
}
