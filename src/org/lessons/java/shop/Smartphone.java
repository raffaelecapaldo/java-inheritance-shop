package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String IMEI;
	private int memoria;
	
	Smartphone(String codice, String nome, String marca,
			double prezzo, double iva, String IMEI, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		setIMEI(IMEI);
		setMemoria(memoria);
		
	}
	
	public String getIMEI() {
		return IMEI;
	}
	
	public void setIMEI(String IMEI) {
		this.IMEI = IMEI;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

}