package br.ifpe;

public class MultaCintoSeguranca extends Multa {
	
	private boolean cinto;;

	public MultaCintoSeguranca(Automovel automovel, GuardaMunicipal guarda, int id) {
		super(automovel, guarda, id);
	
	}

	@Override
	public double calculaValorMulta() {
			
		cinto = ((Carro)getAutomovel()).getCinto();  
		      if(cinto == true) {
		    	  System.out.println();
		    	  System.out.println("Ops, algo errado!");  
			}
		     setValor(195.23);
			return 195.23;
	}
	
	

}
