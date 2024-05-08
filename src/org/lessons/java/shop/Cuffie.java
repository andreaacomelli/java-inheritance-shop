package org.lessons.java.shop;

import java.util.Scanner;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean isWireless;

	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean isWireless) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.isWireless = isWireless;
		// TODO Auto-generated constructor stub
	}
	
	public void inserimentoDatiCuffie() {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Inserisci il colore: ");
        this.colore = scan.nextLine();

        System.out.print("Scrivi true se ile cuffie sono wireless, altrimenti false ");
        this.isWireless = scan.nextBoolean();
        
        scan.close();
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
}
