package classes;

import java.util.Scanner;

public class Agenda {
	
	@SuppressWarnings("resource")
	public Agenda() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Essa � a agenda. Voc� pode marcar hor�rios de atendimento nela.");
		System.out.println("Para isso, basta selecionar o dia e o horario disponivel para marcar o atendimento.");
		System.out.println("");
		String semana [] = new String [10];
		
		semana[0] = "Segunda de manh�";
		semana[1] = "Segunda de tarde";
		semana[2] = "Ter�a de manh�";
		semana[3] = "Ter�a de tarde";
		semana[4] = "Quarta de manh�";
		semana[5] = "Quarta de tarde";
		semana[6] = "Quinta de manh�";
		semana[7] = "Quinta de tarde";
		semana[8] = "Sexta de manh�";
		semana[9] = "sexta de tarde";
		System.out.println("Selecione o valor corresponde ao dia em que voc� deseja marcar um atendimento.");
		System.out.println("(0) Segunda de manh�\n(1)Segunda de tarde\n(2) Ter�a de manh�\n(3)Ter�a de tarde\n((4) Quarta de manh�\n(6)Quarta de tarde\n(6) Quinta de manh�\n(7)Quinta de tarde\n(8) Sexta de manh�\n(9)Sexta de tarde\n");
		int i = input.nextInt();
		if (i == 0) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 1) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 2) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 3) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 4) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 5) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 6) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 7) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 8) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
		if (i == 9) {
			System.out.printf("Seu dia de atendimento foi marcado para %s.\n", semana[i]);
		}
			
			
		
	
	}
	
}
