package br.ifpe;

public class MultaExcessoPeso extends Multa {
	
    private double Sobrecarga; 
        
	public MultaExcessoPeso(Automovel automovel, GuardaMunicipal guarda, int id) {
		super(automovel, guarda, id);
		
	}

	@Override
	public double calculaValorMulta() {
		double carga = ((Caminhao)getAutomovel()).getSobrecarga();
	      
	      if(carga - Sobrecarga <= 600) {
	    	  setValor(130.16);
	    	  System.out.println("Peso m�ximo exigido � em at� 600kg. \n *Infra��o Leve!* "
	    	                           + "\nMulta de: R$  " + getValor());
	    	  return 130.16;
	      }else {
	    		
	    	 if (carga - Sobrecarga >=601 && carga - Sobrecarga<= 1000) {
	    		setValor(195.23);
	    		System.out.println("Peso m�ximo exigido � entre 600kg e 1000kg. \n *Infra��o Mediana!*" + "\nMulta de: R$" + getValor());
	          return 195.23;
	    	    
		}else {
			setValor(carga/500*293.47);
			System.out.println("Peso m�ximo exigido em mais de 1000kg. \n *Infra��o Grave!*" 
			            + "\nMulta de: R$" + getValor());
			
			return carga/500*293.47;	

		}
	      
  }
 }
}