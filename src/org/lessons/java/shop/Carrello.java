package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Hai la carta fedeltà? Rispondere con S o N: ");
		boolean tesserato = false;
		String answer = sc.nextLine().toLowerCase();
		if (answer.contains("s")) {
			tesserato = true;
		}
		System.out.print("Quanti prodotti vuoi acquistare?");
		int numProdotti = Integer.parseInt(sc.nextLine());
		Prodotto[] prodotti = new Prodotto[numProdotti];
		
		for (int i = 0; i < numProdotti; i++) {
		System.out.println("1: SMARTPHONE"
				+ "\n2: TELEVISORE "
				+ "\n3: CUFFIE");
		
		
		System.out.print("Inserisci il numero corrispondete al prodotto da acquistare: ");
		String selezione = sc.nextLine().trim();
		
		System.out.print("Inserire il codice prodotto: ");
		String codice = sc.nextLine();
		System.out.print("Inserire il nome del prodotto: ");
		String nome = sc.nextLine();
		System.out.print("Inserire il nome della marca: ");
		String marca = sc.nextLine();
		
		String IMEI = "";
		int memoria = 0;
		int dimensioni = 0;
		boolean smart = false;
		String colore = "";
		boolean wireless = false;
		
		
		switch (selezione) {
		case "1": 
			System.out.print("Inserire il codice IMEI dello smartphone: ");
			IMEI = sc.nextLine();
			System.out.print("Inserire la quantità di memoria dello Smartphone: ");
			memoria = Integer.parseInt(sc.nextLine());
			
			
			
			break;
			
		case "2": 
			System.out.print("Inserire le dimensioni del televisore: ");
			dimensioni = Integer.parseInt(sc.nextLine());
			System.out.print("Il televisore è SMART? Rispondere con S o N: ");
			String answerA = sc.nextLine().toLowerCase();
			if (answerA.contains("s")) {
				smart = true;
			}
			else {
				smart = false;
			}
			
			
			break;
			
		case "3":
			System.out.print("Inserire il colore delle cuffie: ");
			colore = sc.nextLine();
			System.out.print("Le cuffie sono WIRELESS? Rispondere con S o N: ");
			String answerB = sc.nextLine();
			if (answerB.contains("s")) {
				wireless = true;
			}
			else {
				wireless = false;
			}
			
			
			break;
			
		default: 
			
			System.out.println("PRODOTTO NON VALIDO");
			return;
			
			
		}
		
		System.out.print("Inserisci il prezzo del prodotto: ");
		double prezzo = Double.parseDouble(sc.nextLine());
		System.out.print("Inserisci percentuale iva del prodotto");
		double iva = Double.parseDouble(sc.nextLine());
		
		switch(selezione) {
		case "1":
			prodotti[i] = new Smartphone(codice, nome, marca, prezzo, iva, IMEI, memoria);
			break;
		case "2":
			prodotti[i] = new Televisore(codice, nome, marca, prezzo, iva, dimensioni, smart);
			break;
		case "3":
			prodotti[i] = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);

		}
		
		
	}
		sc.close();
		double prezzoTotale = 0;
	for (int i = 0; i < prodotti.length; i++) {
		if (tesserato) {
			prodotti[i].sconta();
		}
		
		System.out.println("PROD NUM: " + (i+1) + prodotti[i].toString());
		prezzoTotale += prodotti[i].getPrezzo()+prodotti[i].getIva();
	}
	
	System.out.println("Prezzo finale" + (tesserato ? "(sconto tessera incluso): " : ": ") + String.format("%.2f", (prezzoTotale)) + "€" );
	
	
	}
	
	

}
