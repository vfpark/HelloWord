package ativid1;

public class PessoaJuridica extends Cliente {
	
	private String juridico;

	public PessoaJuridica(String nome, int id, int telefone, String juridico) {
		super(nome, id, telefone);
		this.juridico = juridico;
		
	}

	public String getJuridico() {
		return juridico;
	}

	public void setJuridico(String juridico) {
		this.juridico = juridico;
	}
	
	public void visualizar() {

		super.visualizar();
		System.out.println("Qual é o tipo jurídico? " + this.juridico);

	}

}
