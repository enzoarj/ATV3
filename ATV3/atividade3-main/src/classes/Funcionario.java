package classes;

import java.util.Scanner;

public class Funcionario extends Pessoa {
	
		private int credencial;
		private double salario;
		private int contaBancaria;
		
		public void setCredencial(int credencial) {
			this.credencial = credencial;
		}
		public int getCredencial() {
			return credencial;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public double getSalario() {
			return salario;
		}
		
		public void setContaBancaria(int contaBancaria) {
			this.contaBancaria = contaBancaria;
		}
		public int getContaBancaria() {
			return contaBancaria;
		}
		public Funcionario() {
			@SuppressWarnings("resource")
			Scanner input =  new Scanner(System.in);
			
			
			System.out.print("Digite o nome do Funcion�rio a ser contratado:\n");
			String nome = input.nextLine();
			this.setNome(nome);
			
			System.out.print("Digite o Sobrenome do Funcion�rio a ser contratado:\n");
			String sobrenome = input.nextLine();
			this.setSobrenome(sobrenome);
			
			System.out.print("Digite a idade do Funcion�rio:\n");
			int idade = input.nextInt();
			this.setIdade(idade);
			
			System.out.print("Digite o RG do Funcion�rio:\n");
			int rg = input.nextInt();
			this.setRg(rg);
			
			System.out.print("Digite a nova Credencial atribuida ao Funcion�rio:\n");
			int credencial = input.nextInt();
			this.setCredencial(credencial);
			
			System.out.print("Digite o salario do Funcionario:\n");
			double salario = input.nextDouble();
			this.setSalario(salario);
			
			System.out.print("Digite a Conta Banc�ria do Funcion�rio:\n");
			int contaBancaria = input.nextInt();
			this.setContaBancaria(contaBancaria);
			
			System.out.println("Funcion�rio cadastrado!");
		}
}
