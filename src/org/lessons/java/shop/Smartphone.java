package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int memoria;
	
	Smartphone(String codice, String nome, String marca,
			double prezzo, double iva, String imei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		setImei(imei);
		setMemoria(memoria);
		
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Imei telefono: " + getImei()
								+ " Memoria telefono: " + getMemoria();
	}
	
	@Override
	public void sconta() {
		if (getMemoria() < 32) {
		super.setPrezzo(super.getPrezzo() -  (super.getPrezzo() * 5 / 100 ));
		}
		else {
			super.sconta();
		}
		
	}

}
