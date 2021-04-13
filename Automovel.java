package br.ifpe;

import java.util.ArrayList;

public class Automovel {

	private String modelo;
	private int ano;
	private String placa;
	private double velocidade;
	private ArrayList<Multa> listaMulta;

	
	// Métodos
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public ArrayList getlistaMulta() {
		return this.listaMulta;

	}

	public void acelerar(double velocidade) {
		if (velocidade > this.velocidade) {
			this.velocidade = velocidade;
			System.out.println("Ok, velocidade! " + getVelocidade());
		} else {
			System.out.println("Acelera! ");
		}

	}

	public void desacelerar(double velocidade) {
		if (velocidade < this.velocidade) {
			this.velocidade = velocidade;
			System.out.println("Velocidade abaixo do permitido! " + getVelocidade());
		} else {
			System.out.println("Aumente a velocidade!");
		}

	}

	// Construtor
	public Automovel(String modelo, int ano, String placa, int velocidade) {
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.velocidade = velocidade;
		this.listaMulta = new ArrayList<Multa>();

	}
	
	public void listarMultas() {
		for (int i = 0; i < listaMulta.size(); i++) {
			System.out.println(listaMulta.get(i).getId());

		}
	}

	public void adicionar(Multa m) {
		listaMulta.add(m);
	}

	public void remover(int id) {
		Multa m = null;
		for (int i = 0; i < listaMulta.size(); i++) {
			if (id == listaMulta.get(i).getId()) {
				m = listaMulta.get(i);
			}
		}
		listaMulta.remove(m);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Auto: " + getModelo();
	}
	
	

}
