package main;

import java.util.Scanner;
import classes.Empresa;
import classes.Agenda;
import classes.Cliente;
import classes.Produto;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		
		int escolha;
		
		
		System.out.println("Olá, bem vido ao Gerenciador.\n\n");
		System.out.println("Inicializando...\n\n");
		Empresa empresa = new Empresa();
		System.out.printf("Bem vindo ao Gerenciador, Empresa %s.\n", empresa.getNomeEmpresa());
		do {
			System.out.println("Escolha o que você deseja a fazer agora escolhendo uma das opções abaixo:");
			System.out.println("\n1 - Agenda;\n2 - Cadastrar Clientes;\n3 - Estoque;\n4 - Gerenciar dados da Empresa.\n5 - Sair.\n");
			
			escolha = input.nextInt();
			
			if(escolha == 1) {
				
				Agenda agenda = new Agenda();
				
			}if(escolha == 2) {
				
				Cliente cliente = new Cliente();
				
			}if(escolha == 3) {
				Produto produto = new Produto();
				
			}if(escolha == 4){
				empresa.alteraEmpresa(empresa);
			}
			if(escolha == 5){
				System.out.println("Adeus!");
				break;
			}else {
				System.out.println("Digite (1) para Agenda, (2) para Cliente, (3) para Estoque, (4) para alterar dados cadastrados da Empresa e (5) para Sair.");
			}
			}while(escolha != 5);
		
}
}
