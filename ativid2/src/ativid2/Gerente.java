package ativid2;

public class Gerente extends Funcionario {
	
	private int grupoLiderados;

	public Gerente(String nome, String setor, String turno, String cidade, int cep, int grupoLiderados) {
		super(nome, setor, turno, cidade, cep);
		this.grupoLiderados = grupoLiderados;
	}

	public int getGrupoLiderados() {
		return grupoLiderados;
	}

	public void setGrupoLiderados(int grupoLiderados) {
		this.grupoLiderados = grupoLiderados;
	}
	
	public void visualizar() {

		super.visualizar();
		System.out.println("Quantos times você lidera? " + this.grupoLiderados);

	}

}
