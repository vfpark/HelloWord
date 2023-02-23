package mtransporte;

public class Terrestre extends Transporte {
	// extends vincula a super classe com a subclasse
	
	private int numeroRodas;
	protected float velocidade;
	
	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}
	
	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
}
	
	public void visualizar() {

		super.visualizar();
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade);

	}
}