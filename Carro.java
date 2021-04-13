package br.ifpe;

public class Carro extends Automovel {
	
	private boolean cinto;
	
	public Carro(String modelo, int ano, String placa, int velocidade, boolean cinto) {
		super(modelo, ano, placa, velocidade);
		this.cinto = cinto;
		
	}

	
	public boolean getCinto() {
		return cinto;
		
	}
	
	public void setCinto(boolean cinto) {
		   this.cinto = cinto;
	}
	
	

    }
	
	
	
	
	

