package com.loiane.estruturadados.vetor;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, String elemento){
		//verificar se a posica��o � v�lida
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		this.aumentaCapacidade();
		//Ao inserir novo elemento � preciso realiazar mudan�as (trocas de posi��es) 
		//de determinados valores j� presentes no array.
		//movendo elementos do vetor (os elementos s�o percorridos do fim ao come�o)
		for (int i = this.tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i - 1];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
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

	public String busca(int posicao) {
		if (!this.isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}
	
	//busca sequencial (uma das formas b�sicas de busca)
	public int busca(String elemento){
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
		//empurrando os elementos do final at� a posi��o informada
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		//adapta��o: atribuindo null para o elemento que "sobra" no final do array
		if (this.tamanho > 0) {
			this.elementos[this.tamanho - 1] = null;
			this.tamanho--; // atualizando o tamanho do Array (poderia ficar fora do if)
		}
	}
	
	public void remove(String elemento) throws Exception{
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
