package ativid1;

public class Cliente {

	private String nome;
	private int id;
	private int rg;
	private int cpf;
	private int telefone;
	
	public Cliente(String nome, int id, int rg, int cpf, int telefone) {
		super();
		this.nome = nome;
		this.id = id;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
			
	}
	
	public Cliente(String nome, int id, int telefone) {
		super();
		this.nome = nome;
		this.id = id;
		this.telefone = telefone;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
public void visualizar() {
		
		System.out.println("******************************");
		System.out.println("       DADOS DO CLIENTE       ");
		System.out.println("******************************");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("ID do cliente: " + this.id);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Telefone para contato: " + this.telefone);
		System.out.println("");
	}
	
}
