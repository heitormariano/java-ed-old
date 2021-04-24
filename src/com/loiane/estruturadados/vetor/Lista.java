package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		// solução mais elegante e fácil de entender
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		// uso de reflection
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		this.aumentaCapacidade();
		for (int i = this.tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i - 1];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	private boolean isPosicaoValida(int posicao) {
		if (posicao >= 0 && posicao < this.tamanho) {
			return true;
		}
		return false;
	}

	public T busca(int posicao) {
		if (!this.isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	public boolean contem(T elemento) {
		return this.busca(elemento) > -1;
	}

	public int ultimoIndice(T elemento) {
		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (elemento.equals(this.elementos[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(int posicao) {
		if (!isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		if (this.tamanho > 0) {
			this.elementos[this.tamanho - 1] = null;
			this.tamanho--;
		}
		return true;
	}

	public boolean remove(T elemento) throws Exception {
		boolean resultado;
		int posicao = busca(elemento);

		if (posicao > -1) {
			resultado = remove(posicao);
		} else {
			throw new Exception("Elemento " + elemento + " não existe no vetor");
		}

		return resultado;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public void limpar() {
		// opcao 3 (percorrendo as posicoes ocupadas e setando o valor null)
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;

		// opcao 1
		// this.elementos = (T[]) new Object[this.elementos.length];

		// opcao 2 (apenas zerando a variável tamanho
		// this.tamanho = 0;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}
}
