package ativid2;

public class Vendedor extends Funcionario {
	
	private String meta;

	public Vendedor(String nome, String setor, String turno, String cidade, int cep, String meta) {
		super(nome, setor, turno, cidade, cep);
		this.meta = meta;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}
	
	public void visualizar() {

		super.visualizar();
		System.out.println("Bateu a meta de R$5.000,00 em vendas neste mês? " + this.meta);

	}

}
