package br.ifpe;

public interface Guarda {

	public void verificaVelocidade(Automovel a, double limiteVelocidade);
	public void autuarEstacionamento(Automovel a);
	public void MultaCapacete(Automovel a, boolean capacete);
	public void MultaCintoSeguranca(Automovel a, boolean cinto);
	public void MultaExcessoPeso(Automovel a, double sobrecarga);
	
}
  