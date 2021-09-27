package classes;

import java.util.Scanner;

public class Cliente extends Pessoa {

	private String alergia;
	private String tipoAlergia;
	
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	public String getAlergia() {
		return alergia;
	}
	public void setTipoAlergia(String tipoAlergia) {
		this.tipoAlergia = tipoAlergia;
	}
	public String getTipoAlergia () {
		return tipoAlergia;
	}
	
	public Cliente() {
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		
		
		System.out.print("Digite o nome do Cliente a ser atendido:\n");
		String nome = input.nextLine();
		this.setNome(nome);
		
		System.out.print("Digite o Sobrenome do Cliente a ser atendido:\n");
		String sobrenome = input.nextLine();
		this.setSobrenome(sobrenome);
		
		System.out.print("Digite a idade do Cliente:\n");
		int idade = input.nextInt();
		this.setIdade(idade);
		
		System.out.print("Digite o RG do Cliente:\n");
		int rg = input.nextInt();
		this.setRg(rg);
		
		System.out.print("Digite a alergia do Cliente:\n");
		String alergia = input.nextLine();
		this.setAlergia(alergia);
		
		System.out.print("Digite o tipo de alergia atribuida ao Cliente:\n");
		String tipoAlergia = input.nextLine();
		this.setTipoAlergia(tipoAlergia);
		
		System.out.println("Cliente cadastrado com sucessso!");
		
		
		
	}
}
