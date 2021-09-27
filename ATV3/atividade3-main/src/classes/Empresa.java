package classes;

import java.util.Scanner;
import classes.Funcionario;

@SuppressWarnings("unused")
public class Empresa {

	private String nomeEmpresa;
	private String cnpj;
	private String nicho;
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	public String cnpj() {
		return cnpj;
	}
	
	public void setNicho(String nicho) {
		this.nicho = nicho;
	}
	public String getNicho() {
		return nicho;
	}
	
	
	public Empresa() {
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		
		
		System.out.print("Digite o nome da Empresa a ser gerenciada:\n");
		String nomeEmpresa = input.nextLine();
		this.setNomeEmpresa(nomeEmpresa);
		
		System.out.print("Digite o CNPJ da Empresa:\n");
		String cnpj = input.nextLine();
		this.setCnpj(cnpj);
		
		System.out.print("Digite o nicho de atuação da Empresa:\n");
		String nicho = input.nextLine();
		this.setNicho(nicho);
		
		Empresa.contrataFuncionario();
	}
	
	public static void contrataFuncionario() {
		System.out.println("Iniciando cadastro de funcionários.\n");
		System.out.println("Cadastrando Massoterapeuta.\n");
		Funcionario funcionario = new Funcionario();
	}
	
	@SuppressWarnings("resource")
	public void alteraEmpresa(Empresa empresa) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.printf("O nome atual da Empresa é %s.\n", empresa.getNomeEmpresa());
		System.out.println("Deseja alterar o nome da Empresa?\n");
		System.out.println("Para sim, digite (1).Para deixar como está, digite (2).\n");
		int escolha2 = input.nextInt();
		if(escolha2 == 1); {
			Scanner in = new Scanner(System.in);
			System.out.print("Digite o nome da Empresa a ser gerenciada:\n");
			String nomeEmpresa = in.nextLine();
			empresa.setNomeEmpresa(nomeEmpresa);
			System.out.printf("O nome da Empresa agora é %s.\n", empresa.getNomeEmpresa());
			System.out.printf("Voltando ao menu principal.\n");
			
		}if (escolha2 == 2) {
			System.out.printf("Voltando ao menu principal.\n");}
		
	}
}
