package org.lessons.java.shop;

public class Cuffie extends Prodotto {

	String colore;
	boolean wireless;
	
	Cuffie(String codice, String nome, String marca,
			double prezzo, double iva,
			String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		setColore(colore);
		setWireless(wireless);
		
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public boolean isWireless() {
		return wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
}