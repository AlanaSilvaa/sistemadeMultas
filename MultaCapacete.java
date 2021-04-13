package br.ifpe;

public class MultaCapacete extends Multa {

	private boolean capacete;

	public MultaCapacete(Automovel automovel, GuardaMunicipal guarda, int id) {
		super(automovel, guarda, id);
	}

	@Override
	public double calculaValorMulta() {

		capacete = ((Moto) getAutomovel()).getCapacete();
	//	if (getAutomovel()instanceof Moto) {
	//		System.out.println(((Moto) getAutomovel()).getCapacete());
	//	}
		if (capacete == false) {
			System.out.println("Tem algo errado!");
		}
		setValor(293.47);
		return 293.47;

	}

}
