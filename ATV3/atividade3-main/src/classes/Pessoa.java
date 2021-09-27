package classes;

public abstract class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected int idade;
	protected int rg;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getRg() {
		return rg;
	}
	
	
}
