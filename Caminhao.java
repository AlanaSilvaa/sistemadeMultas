package br.ifpe;

public class Caminhao extends Automovel {
	
	private double Sobrecarga;

	public Caminhao(String modelo, int ano, String placa, int velocidade, double Sobrecarga) {
		super(modelo, ano, placa, velocidade);
		this.Sobrecarga = Sobrecarga;
	}
	
	public double getSobrecarga() {
		return Sobrecarga ;
	}
    
	public void setSobrecarga(double Sobrecarga) {
		this.Sobrecarga = Sobrecarga;
	}

}
