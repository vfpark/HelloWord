package ativid2;

public class Funcionario {

	private String nome;
	private String setor;
	private String turno;
	private String cidade;
	private int cep;
	
	public Funcionario(String nome, String setor, String turno, String cidade, int cep) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.turno = turno;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
public void visualizar() {
		
		
		System.out.println("*******************************");
		System.out.println("   DADOS DOS FUNCIONARIO(A)s   ");
		System.out.println("******************************");
		System.out.println("Nome do funcionário(a): " + this.nome);
		System.out.println("Setor em que trabalha: " + this.setor);
		System.out.println("Turno de trabalho: " + this.turno);
		System.out.println("Cidade em que reside: " + this.cidade);
		System.out.println("CEP: " + this.cep);
		System.out.println("");
	}

}
