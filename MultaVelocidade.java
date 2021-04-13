package br.ifpe;

public class MultaVelocidade extends Multa {

	private double limiteVelocidade;
	
	
	public MultaVelocidade( Automovel automovel, GuardaMunicipal guarda, double limiteVelocidade, int id) {
		super( automovel, guarda, id);
		this.limiteVelocidade = limiteVelocidade;
	}

	
	@Override
	public double calculaValorMulta() {
		double velAuto = getAutomovel().getVelocidade();
		
		if(velAuto>limiteVelocidade&(velAuto<=(1.2*limiteVelocidade))) {
			setValor(130.16);
	    return 130.16;
	}
	else 
		if(velAuto>1.2*limiteVelocidade && velAuto <=1.5* limiteVelocidade) {
		setValor(195.23);
		return 195.23;
	}
	else 
	     {
		setValor(293.47);
		return 293.47;
	}
	}
}