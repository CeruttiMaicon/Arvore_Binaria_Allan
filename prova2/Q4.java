package prova2;

import java.util.Scanner;

import fila.estatica.FilaEstatica;

public class Q4 {
	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		FilaEstatica fila = new FilaEstatica(10);

		int qtde = 0;
		
		while (true) {
			System.out.println("1– Novo atendimento\n2– Atender\n3– Exibir fila\n4– Sair");
			System.out.println("Informe a opção: ");

			int opcao = teclado.nextInt(); 
			
			switch (opcao) {
			case 1:
				if (qtde < 10) {
					System.out.println("Informe o nome do paciente: ");
					String nome = teclado.next();

					fila.add(nome);
					qtde++;
				} else {
					System.out.println("Limite de atendimentos excedido");
				}

				break;
			case 2:
				if (!fila.isEmpty()) {
					String nome = (String) fila.remove();
					System.out.println("Atendendo paciente " + nome);
				}

				break;
			case 3:
				System.out.println("Pacientes na fila de espera ");
				fila.list();

				break;
			case 4:
				teclado.close();
				System.exit(0);
			}
		}

	}
}
