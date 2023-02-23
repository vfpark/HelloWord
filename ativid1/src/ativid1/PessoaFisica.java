package ativid1;

public class PessoaFisica extends Cliente{
	
	private String civil;
	
	public PessoaFisica(String nome, int id, int rg, int cpf, int telefone, String civil) {
		super(nome, id, rg, cpf, telefone);
		this.civil = civil;
	}
	
	public String civil() {
		return civil;
	}

	public void civil(String civil) {
		this.civil= civil;
	}
	
	public void visualizar() {

		super.visualizar();
		System.out.println("Qual é o estado civil? " + this.civil);

	}
}
