package br.ifpe;


public class Launch {

	public static void main(String[] args) {
		
		Automovel c = new Carro("VRAU", 2018, "VITU-1619", 350, false);
		GuardaMunicipal g = new GuardaMunicipal(0001, "Pedro ");
		Automovel cc = new Moto("AZUL", 2019, "KKK-6335", 100, false);
		Automovel ccc = new Caminhao("Renault", 2020, "flop-5437", 120, 2000);
		//Multa m1 = new MultaEstacionamento(c, g, 01, 2);
		//Multa m2 = new MultaVelocidade(c, g, 30, 02);
		
		g.verificaVelocidade(c, 80);
		System.out.println();
		g.MultaCapacete(cc, true);
		System.out.println();
		try {
        	g.MultaCapacete(c, true);
        } catch(Exception e) {
          System.err.println("Não pode multar um carro por está sem capacete!");
          System.out.println();
        }
		System.out.println();
		g.MultaCintoSeguranca(c, true);	
		g.MultaExcessoPeso(ccc, 20);
		System.out.println();
        g.autuarEstacionamento(c);
        
      
	
		
		//c.acelerar(90);
		//c.desacelerar(120);
			
		//c.adicionar(m1);
		//c.adicionar(m2);
		//c.listarMultas();
		
//		Multa m = new MultaVelocidade(c, g, 100);
//		System.out.println(m.calculaValorMulta());
	    
	}
	
}	
	
   



