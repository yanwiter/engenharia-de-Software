package projetoPinos;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuracoRedondo buracoRedondo = new BuracoRedondo(50);
		PinoQuadrado pinoQuadrado = new PinoQuadrado(10);
		System.out.println("A largura do pino quadrado é: " + pinoQuadrado.getLargura());
		System.out.println("O quadrado tem: " + pinoQuadrado.getQuadrado());

		PinoQuadradoAdapter newInstanciaPino = new PinoQuadradoAdapter(pinoQuadrado);
		System.out.println("O raio do pino redondo é: " + newInstanciaPino.getRaio());
		System.out.println("O pino redondo encaixa no buraco? " + buracoRedondo.Encaixa(newInstanciaPino));

	}
}
