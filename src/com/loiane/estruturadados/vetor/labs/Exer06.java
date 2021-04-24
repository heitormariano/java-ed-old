package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exer06 {

	private static Scanner scan;
	private static Lista<Contato> lista;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		lista = new Lista<Contato>(20);

		int opcao = -1;
		do {
			int indice = -1;
			boolean result = false;

			opcao = lerOpcao(scan, opcao);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan);
				break;
			case 2:
				adicionarContato(scan);
				break;
			case 3:
				adicionarContatos();
				break;
			case 4:
				buscarContatoPorPosicao(scan);
				break;
			case 5:
				buscarContato(scan);
				break;
			case 6:
				
				break;
			case 7:
				excluirContato(indice, result);
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				imprimirLista();
				break;
			case 11:
				limparLista();
				break;
			default:
				System.out.println("Opção inválida. Digite novamente");
				break;
			}

		} while (opcao != 0);
		System.out.println("Fim Programa");
	}

	public static int lerOpcao(Scanner scan, int opcao) {

		System.out.println("Exercício 06");
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Adicionar contato no final");
		System.out.println("2 - Adicionar contato em uma posição");
		System.out.println("3 - Adicionar contatos (30) automaticamente");
		System.out.println("4 - Buscar contato (usando índice)");
		System.out.println("5 - Buscar contato");
		System.out.println("6 - Buscar último índice de Contato");
		System.out.println("7 - Remover contato (usando índice)");
		System.out.println("8 - Remover contato");
		System.out.println("9 - Consultar tamanho lista");
		System.out.println("10 - Imprimir contatos da Lista");
		System.out.println("11 - Limpar lista");
		System.out.println("0 - Encerrar o Programa");

		opcao = scan.nextInt();
		return opcao;
	}

	public static void adicionarContatoFinal(Scanner scan) {
		Contato contato = new Contato();
		
		System.out.println("Informe Os dados pedidos para o Contato:");
		System.out.println("Nome:");

		scan.nextLine();
		String nome = scan.nextLine();

		System.out.println("Telefone:");
		String telefone = scan.nextLine();

		System.out.println("E-mail:");
		String email = scan.nextLine();

		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);

		lista.adiciona(contato);
	}
	
	public static void adicionarContato(Scanner scan){
		Contato contato = new Contato();
		int posicao = -1;
		
		System.out.println("Informe Os dados pedidos para o Contato:");
		
		System.out.println("Nome:");
		scan.nextLine();
		String nome = scan.nextLine();

		System.out.println("Telefone:");
		String telefone = scan.nextLine();

		System.out.println("E-mail:");
		String email = scan.nextLine();

		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		System.out.println("Informe a posição (índice) para o contato:");
		posicao = scan.nextInt();
		
		lista.adiciona(posicao, contato);
	}
	
	public static void adicionarContatos() {
		for (int i = 0; i < 30; i++) {

			Contato contato = new Contato();

			String nome = "Contato";
			String telefone = "98899-45";
			String email = "contato_";

			nome = nome + (Integer.toString(i));
			email = email + Integer.toString(i) + "@teste.com.br";
			if (i < 10) {
				telefone = telefone + Integer.toString(i) + Integer.toString(i);
			} else {
				telefone = telefone + Integer.toString(i);
			}

			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);

			lista.adiciona(contato);
		}
	}

	public static void buscarContatoPorPosicao(Scanner scan){
		Contato contato = new Contato();
		int indice = -1;
		
		System.out.println("[Buscar]Informe o índice do contato:");
		indice = scan.nextInt();

		contato = lista.busca(indice);
		System.out.println("Contato encontrado:\n " + contato.toString());
	}
	
	
	public static void buscarContato(Scanner scan){
		Contato contato = new Contato();
		int indice = -1;

		System.out.println("[Buscar]Informe o índice do contato:");
		indice = scan.nextInt();

		contato = lista.busca(indice);
		
		//realizando a busca pelo objeto Contato
		int pos = lista.busca(contato);
		if (pos > -1) {
			System.out.println("Dados do contato encontrado.");

			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println();

		} else {
			System.out.println("Contato não encontrado");
		}
		
	}
	
	public static void buscarUltimoIndiceContato(){
		Contato contato = new Contato();
		int indice = -1;

		System.out.println("[Buscar] Informe o índice do contato:");
		indice = scan.nextInt();

		contato = lista.busca(indice);
		
		int ultimoIndice =  lista.ultimoIndice(contato);
		if(ultimoIndice > -1){
			System.out.println("Último índice do contato: " + ultimoIndice);
		}else{
			System.out.println("Último índice inválido: " + ultimoIndice);
		}
	}
	
	public static void excluirContato(int indice, boolean result){
		System.out.println("[Excluir]Informe o índice do contato:");
		indice = scan.nextInt();

		result = lista.remove(indice);
		System.out.println("Resultao:" + (result ? "Sucesso" : "Falha na operação"));
	}
	
	public static void limparLista(){
		lista.limpar();
		System.out.println("Operação de limpeza realizada");
	}
	
	public static void imprimirLista(){
		System.out.println("Resultado: \n" + lista.toString());
	}
	
}

