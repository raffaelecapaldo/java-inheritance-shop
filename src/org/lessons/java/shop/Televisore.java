package org.lessons.java.shop;

public class Televisore extends Prodotto {
	
	int dimensioni;
	boolean smart;
	
	Televisore(String codice, String nome, String marca,
			double prezzo, double iva,
			int dimensioni, boolean smart) {
		
		super(codice, nome, marca, prezzo, iva);
		setDimensioni(dimensioni);
		setSmart(smart);
		
	}
	
	public int getDimensioni() {
		return dimensioni;
	}
	
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public boolean isSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
