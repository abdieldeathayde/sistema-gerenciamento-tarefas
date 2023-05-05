package gerenciamentoTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tarefa {
	
	List<Tarefa> tarefa = new ArrayList<Tarefa>();
	String nome;
	String descricao;
	
	public Tarefa(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, nome, tarefa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(nome, other.nome)
				&& Objects.equals(tarefa, other.tarefa);
	}
	

//	public Tarefa adicionarTarefa(String nome, String descricao, Calendar data_inicio, Calendar data_conclusao) {
//		data_inicio = Calendar.getInstance();
//		Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar Padrões de Projetos em Java \n" );
//		Tarefa tarefa2 = new Tarefa("Estudar Banco de dados", "Estudar banco de dados SQL Server \n");
//		Tarefa tarefa3 = new Tarefa("Estudar Spring", "Estudar Spring JPA Gradle \n");
//		tarefa.add(tarefa1);
//		tarefa.add(tarefa2);
//		tarefa.add(tarefa3);
//		
//		System.out.println("Tarefa1: " + tarefa1.nome + "Descricao" + tarefa1.descricao + " \nTarefa2: " + tarefa2.nome + " Descricao: " + tarefa2.descricao + " \nTarefa3: " + tarefa3.nome + " Descricao" + tarefa3.descricao);
//		return tarefa3;				
//	}

//	@Override
//	public String toString() {
//		return "Tarefa [nome=" + nome + ", descricao=" + descricao + ", data_inicio=" + data_inicio
//				+ "\n"  + ", data_conclusao=" + data_conclusao + "]";
//	}
}
