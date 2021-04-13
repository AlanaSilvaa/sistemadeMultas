package br.ifpe;

public abstract class Multa  {
	
	private double valor;
	private GuardaMunicipal guarda;
	private Automovel automovel;
	private int id;
	
	
	public int getId () {
		 return this.id;
	}
	
	public void setMulta(int id) {
		   this.id = id;
	}
	

	public double getValor () {
		return this.valor;
	}
	
	public void setValor(double valor) {
		   this.valor = valor;
	}
	
	public Automovel getAutomovel () {
		return this.automovel;
	}
	
	public void setAutomovel(Automovel automovel) {
		   this.automovel = automovel;
	}
	

	
	public GuardaMunicipal getGuarda () {
		return this.guarda;
	}
	
	public void setGuarda(GuardaMunicipal guarda) {
		   this.guarda = guarda;
	}
	
	public abstract double calculaValorMulta();
	       
	
	
	
	//Construtor
	public Multa ( Automovel automovel, GuardaMunicipal guarda, int id) {
		this.automovel = automovel;
		this.guarda = guarda;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Valor" + getValor();
	}
}
