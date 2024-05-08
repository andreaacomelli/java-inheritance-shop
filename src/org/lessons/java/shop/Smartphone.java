package org.lessons.java.shop;

import java.util.Scanner;

public class Smartphone extends Prodotto {
	
	private long imei;
    private int memoriaGB;

	public Smartphone(int codice, String nome, String marca, double prezzo, double iva, long imei, int memoriaGB) {
		super(nome, marca, prezzo, iva);
		this.imei = imei;
		this.memoriaGB = memoriaGB;
		
		// TODO Auto-generated constructor stub
	}
	
	public void inserimentoDatiSmartphone() {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Inserisci il codice imei: ");
        this.imei = scan.nextLong();

        System.out.print("Inserisci il nome del prodotto: ");
        this.memoriaGB = scan.nextInt();
        
        scan.close();
	}

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public int getMemoriaGB() {
		return memoriaGB;
	}

	public void setMemoriaGB(int memoriaGB) {
		this.memoriaGB = memoriaGB;
	}
}
