package org.lessons.java.shop;

public class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	Prodotto(String codice, String nome, String marca,
			double prezzo, double iva) {
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String getPrezzoPubblico() {
		return String.format("%.2f", (prezzo+iva)) + "€";
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return " Codice prodotto: " + getCodice()
				+ " Nome prodotto: " + getNome()
				+ " Marca prodotto: " + getMarca()
				+ " Prezzo prodotto: " + getPrezzo()
				+ " Iva prodotto: " + getIva()
				+ " Prezzo finale: " + getPrezzoPubblico();
 	}
	
	
	
	
	
}
