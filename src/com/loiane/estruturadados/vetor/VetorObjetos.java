package com.loiane.estruturadados.vetor;

public class VetorObjetos {
	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, Object elemento){
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		this.aumentaCapacidade();
		for (int i = this.tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i - 1];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	private boolean isPosicaoValida(int posicao){
		if(posicao >= 0 && posicao < this.tamanho){
			return true;
		}
		return false;
	}

	public Object busca(int posicao) {
		if (!this.isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao){
		if (!isPosicaoValida(posicao)) {
			new IllegalArgumentException("Posi��o Inv�lida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		if (this.tamanho > 0) {
			this.elementos[this.tamanho - 1] = null;
			this.tamanho--; 
		}
	}
	
	public void remove(Object elemento) throws Exception{
		int posicao = busca(elemento);
		
		if(posicao > -1){
			remove(posicao);
		}else{
			throw new Exception("Elemento " + elemento +  " n�o existe no vetor");
		}
	}

	public int tamanho() {
		return this.tamanho;
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
