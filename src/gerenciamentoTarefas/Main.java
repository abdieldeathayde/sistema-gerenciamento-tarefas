package gerenciamentoTarefas;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class Main {

	// criar métodos para criar remover e buscar tarefas

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		opcao = sc.nextInt();
		
		
		switch(opcao){
			case 0:
				break;
			case 1:
				Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar POO em Java");
				Tarefa tarefa2 = new Tarefa("Estudar Java", "Estudar Estrutura de dados em Java");
				Tarefa tarefa3 = new Tarefa("Estudar Java", "Estudar Padrões de Projetos em Java");
				Tarefa tarefa4 = new Tarefa("Estudar Banco de dados", "Estudar banco de dados SQL Server");
				Tarefa tarefa5 = new Tarefa("Estudar Spring", "Estudar Spring JPA Gradle");
				
				System.out.println("Tarefa1: " + tarefa1.nome + " Descrição: " + tarefa1.descricao + " \nTarefa2: " + tarefa2.nome + " Descrição: " + tarefa2.descricao + "\nTarefa3: " + tarefa3.nome + " Descrição: " + tarefa3.descricao + "\nTarefa4: " + tarefa4.nome + " Descrição: " + tarefa4.descricao + "\nTarefa5: " + tarefa5.nome + " Descrição: " + tarefa5.descricao);
			case 2:
				
		
		}
		
	}


}