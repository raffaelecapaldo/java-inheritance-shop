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
	
	@Override
	public String toString() {
		return super.toString() + " Colore cuffie " + getColore()
								+ " Tipo: " + (wireless ? "WIRELESS": "CABLATE");
	}
	
	@Override
	public void sconta() {
		if (!isWireless()) {
		super.setPrezzo(super.getPrezzo() -  (super.getPrezzo() * 7 / 100 ));
		}
		else {
			super.sconta();
		}}
}
