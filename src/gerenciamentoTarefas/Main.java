package gerenciamentoTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		System.out.println("Escolha uma opção: \n0- Sair \n1- Remover Tarefa \n2- Adicionar Tarefa \n3- Buscar Tarefa");
		opcao = sc.nextInt();
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar POO em Java");
		Tarefa tarefa2 = new Tarefa("Estudar Java", "Estudar Estrutura de dados em Java");
		Tarefa tarefa3 = new Tarefa("Estudar Java", "Estudar Padrões de Projetos em Java");
				
		tarefas.add(new Tarefa("Estudar Matematica","Matematca"));
		tarefas.add(tarefa1);
		tarefas.add(tarefa2);
		tarefas.add(tarefa3);
		
		
		switch(opcao){
			case 0:
				break;
			case 1:
				tarefas.remove(1);
				for (int i = 0; i < tarefas.size(); i ++) {
					System.out.println(tarefas.get(i));
				}
				break;
				
			case 2:
				Tarefa tarefa4 = new Tarefa("Estudar Banco de dados", "Estudar banco de dados SQL Server");
				Tarefa tarefa5 = new Tarefa("Estudar Spring", "Estudar Spring JPA Gradle");
				tarefas.add(tarefa4);
				tarefas.add(tarefa5);
				
			case 3: 
				System.out.print("escolha qual tarefa quer buscar, 1, 2, 3, 4 ou 5: ");
				int escolha = sc.nextInt();
				
				System.out.println(tarefas.get(escolha));
				break;		
		}	
	}
}