package classes;

import java.util.Scanner;

public class Produto {

	
	protected String nome;
	protected String tipo;
	protected String validade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getValidade() {
		return validade;
	}
	
	@SuppressWarnings("resource")
	public Produto() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Iniciando seu estoque.\n");
		System.out.println("Para começar, vamos cadastrar alguns produtos.");
		System.out.println("Qual o nome do produto a ser cadastrado?");
		String nome = input.nextLine();
		this.setNome(nome);
		System.out.println("Qual o tipo do produto?");
		String tipo = input.nextLine();
		this.setTipo(tipo);
		System.out.println("Qual a validade? (Digite separando por //.");
		String validade = input.nextLine();
		this.setValidade(validade);
		System.out.println("Produto cadastrado!");
	}
	
}
