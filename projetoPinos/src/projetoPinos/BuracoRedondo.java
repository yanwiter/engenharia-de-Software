package projetoPinos;

public class BuracoRedondo {
	
	private final double raio;

	public BuracoRedondo(double raio) {
		this.raio = raio;
	}

	public boolean Encaixa(PinoRedondo pino) {
		return this.raio > pino.getRaio();
	}
}
