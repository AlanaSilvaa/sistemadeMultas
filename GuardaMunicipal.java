package br.ifpe;

public class GuardaMunicipal implements Guarda{

	private static final Moto Moto = null;
	private int id;
	private String nome;
	
	//Construtor
		public GuardaMunicipal(int id, String nome) {
			this.id = id;
			this.nome = nome;	
			
	}
	
	//Métodos
	public int getId () {
		return this.id;
	}
	
	public void setId(int id) {
		   this.id = id;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setAno(String nome) {
		   this.nome = nome;
		
	}
	public  void setverificarVelocidade() {
		 
	
	}
	

	@Override
	public void verificaVelocidade(Automovel a, double limiteVelocidade) {
		
		if(a.getVelocidade()>limiteVelocidade) {
			Multa m = new MultaVelocidade(a, this, 80, 0);
			m.calculaValorMulta();
			System.out.println("Você foi multado por ultrapassar o limite de velocidade! \n Multa de: R$"+ m.getValor());
			
		}else {
		    
		System.out.println("Velocidade normal");
	}
	}

	@Override
	public void autuarEstacionamento(Automovel a) {
		Multa m = new MultaEstacionamento(a, this, 2, 0);
		m.calculaValorMulta();
		a.adicionar(m);
		System.out.println("Estacionou em local proibido! \nMulta de: R$" + m.getValor());
		
	}

	

	@Override
	public void MultaCapacete(Automovel a, boolean capacete) {
		capacete = ((Moto)a).getCapacete();
	//	if (getAutomovel()instanceof Moto) {
	//		System.out.println(((Moto) getAutomovel()).getCapacete());
	//	}
		
		if(capacete == false) {
		Multa m = new MultaCapacete(a, this, 02);
		m.calculaValorMulta();
		a.adicionar(m);
		System.out.println("Você foi multado por não usar capacete! \nMulta de : R$" + m.getValor());
		}
		else {
			System.out.println("Está com capacete, prossiga.");
		}
	
	}

	public  Moto getAutomovel() {
		return Moto;
	}

	@Override
	public void MultaCintoSeguranca(Automovel a, boolean cinto) {
        cinto = ((Carro)a).getCinto();
       
		if(cinto == false) {
		Multa m = new MultaCintoSeguranca(a, this, 02);
		m.calculaValorMulta();
		a.adicionar(m);
		System.out.println("Você foi multado por não usar o cinto de segurança! \nMulta de : R$" + m.getValor());
		}
		else {
			System.out.println("Está com cinto, tudo ok");
		
	}

	
	
	}

	@Override
	public void MultaExcessoPeso(Automovel a, double sobrecarga) {
		double carga = ((Caminhao)a).getSobrecarga();
		if (carga > sobrecarga) {
		 Multa n = new MultaExcessoPeso(a, this, 850);
		 n.calculaValorMulta();
		 a.adicionar(n);
		 System.out.println("Você foi multado por sobrecarga: R$" + n.getValor());
		
	}else {
		System.out.println("Você está dentro dos limites permitidos!");
	}

	}


}