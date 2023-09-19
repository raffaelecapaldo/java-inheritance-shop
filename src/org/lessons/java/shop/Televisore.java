package org.lessons.java.shop;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smart;
	
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
	

	@Override
	public String toString() {
		return super.toString() + " Dimensioni televisore: " + getDimensioni()
								+ " SMART: " + (smart ? "SI" : "NO");
	}
	
	@Override
	public void sconta() {
		if (!isSmart()) {
		super.setPrezzo(super.getPrezzo() -  (super.getPrezzo() * 10 / 100 ));
		}
		else {
			super.sconta();
		}}


}
