package gerenciamentoTarefas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tarefa {
	
	List<Tarefa> tarefa = new ArrayList<Tarefa>();
	String nome;
	String descricao;
	int i;
	int j; 
	int k;
	int l;
	int m;
	int n;
	Calendar data_inicio = Calendar.getInstance();
	Calendar data_conclusao = Calendar.getInstance();
	
	public Tarefa(String nome, String descricao, int i, int j, int k, int l, int m, int n) {
		this.nome = nome;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_conclusao = data_conclusao;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
		this.n = n;
	}

	public Tarefa(String string, String string2, Date time) {
		// TODO Auto-generated constructor stub
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

	public Calendar getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Calendar getData_conclusao() {
		return data_conclusao;
	}
	public void setData_conclusao(Calendar data_conclusao) {
		this.data_conclusao = data_conclusao;
	}
		
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Tarefa adicionarTarefa(String nome, String descricao, Calendar data_inicio, Calendar data_conclusao) {
		data_inicio = Calendar.getInstance();
		Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar Padrões de Projetos em Java \n", data_inicio.getTime() );
		Tarefa tarefa2 = new Tarefa("Estudar Banco de dados", "Estudar banco de dados SQL Server \n", data_inicio.getTime());
		Tarefa tarefa3 = new Tarefa("Estudar Spring", "Estudar Spring JPA Gradle \n", data_inicio.getTime());
		tarefa.add(tarefa1);
		tarefa.add(tarefa2);
		tarefa.add(tarefa3);
		
		System.out.println("Tarefa1: " + tarefa1.nome + "Descricao" + tarefa1.descricao + " \nTarefa2: " + tarefa2.nome + " Descricao: " + tarefa2.descricao + " \nTarefa3: " + tarefa3.nome + " Descricao" + tarefa3.descricao);
		return tarefa3;		
		
	}
	
	public void exibirTarefa() {
//		final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		final Calendar cal = Calendar.getInstance();
//		System.out.println(df.format(cal.getTime())); 
		
		System.out.printf("Tarefas: " + tarefa);
		
		
//		System.out.println(adicionarTarefa("Estudar Matematica", "Estudar Juros", 2023/05/03, 2023/05/23));
		
		Iterator<Tarefa> it = tarefa.iterator();
		
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
//		for (int i = 0; i < tarefa.size(); i++) {
////			String collection = tarefa.get(i).toString();
//			System.out.println("Tarefas: " + tarefa.get(i));
//		}
//		return (Tarefa) tarefa;
	}


	@Override
	public String toString() {
		return "Tarefa [nome=" + nome + ", descricao=" + descricao + ", data_inicio=" + data_inicio
				+ "\n"  + ", data_conclusao=" + data_conclusao + "]";
	}
	
	
	
	
	
	
		
	

}
