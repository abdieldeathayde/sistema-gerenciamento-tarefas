package gerenciamentoTarefas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.List;
import gerenciamentoTarefas.Tarefa;

@SuppressWarnings("unused")
public class Main {

	// criar métodos para criar remover e buscar tarefas

	public static void main(String[] args) {
		
		Calendar data_inicio = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		Calendar data_conclusao = Calendar.getInstance();
		
//		data_inicio.getTime();
		
		int hora_inicio = data_inicio.get(Calendar.HOUR_OF_DAY);
		int minuto_inicio = data_inicio.get(Calendar.MINUTE);
		int segundo_inicio = data_inicio.get(Calendar.SECOND);
		int hora_conclusao = data_conclusao.get(Calendar.HOUR_OF_DAY);
		int minuto_conclusao = data_conclusao.get(Calendar.MINUTE);
		int segundo_conclusao = data_conclusao.get(Calendar.SECOND);
		
		Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar POO em Java \n", hora_inicio , minuto_inicio , segundo_inicio , hora_conclusao , minuto_conclusao, segundo_conclusao );
		Tarefa tarefa2 = new Tarefa("Estudar Java", "Estudar Estrutura de dados em Java \n", hora_inicio, minuto_inicio, segundo_inicio , hora_conclusao, minuto_conclusao, segundo_conclusao);
		
		List<Tarefa> tarefas = new ArrayList<>();
		tarefas.add(tarefa1);
		tarefas.add(tarefa2);
		
		
		int hora_inicio2 = data_inicio.get(Calendar.HOUR_OF_DAY);
		int minuto_inicio2 = data_inicio.get(Calendar.MINUTE);
		int segundo_inicio2 = data_inicio.get(Calendar.SECOND);
		int hora_conclusao2 = data_conclusao.get(Calendar.HOUR_OF_DAY);
		int minuto_conclusao2 = data_conclusao.get(Calendar.MINUTE);
		int segundo_conclusao2 = data_conclusao.get(Calendar.SECOND);
		
//		data_conclusao.getTime();
		
		
		System.out.println(tarefa1.toString());
		System.out.println(tarefa2.toString());
		
		System.out.println("Tarefa1 \n" + hora_inicio + ":" + minuto_inicio + ":" + segundo_inicio );
		System.out.println("Tarefa2 \n" + hora_inicio2 + ":" + minuto_inicio2 + ":" + segundo_inicio2);
		
		System.out.println("Tarefa1: " + tarefa1.nome + " Descrição: " + tarefa1.descricao + " \nTarefa2: " + tarefa2.nome + " Descrição: " + tarefa2.descricao);
//		tarefa1.adicionarTarefa(null, null, data_inicio, data_conclusao)
		
//		Tarefa trf = new Tarefa();
		tarefa1.exibirTarefa();
//		System.out.print(Tarefa.exibirTarefa(tarefas));
		
		
		
	}
	
} 