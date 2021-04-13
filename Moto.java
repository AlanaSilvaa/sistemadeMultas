package br.ifpe;


public class Moto extends Automovel {
	
	private boolean capacete;
	
	public Moto(String modelo, int ano, String placa, int velocidade, boolean capacete) {
		super(modelo, ano, placa, velocidade);
		this.capacete = capacete;
	}
	
	public boolean getCapacete() {
		return capacete;
		
	}
	
	public void setCapacete(boolean capacete) {
		   this.capacete = capacete;
	}
	
	
	
	
	
	
}	
	

