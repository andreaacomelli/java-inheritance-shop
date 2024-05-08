package org.lessons.java.shop;

import java.util.Scanner;

public class Televisore extends Prodotto{
	
	private String pollici;
	private boolean isSmart;

	public Televisore(int codice, String nome, String marca, double prezzo, double iva, String pollici, boolean isSmart) {
		super(nome, marca, prezzo, iva);
		this.pollici = pollici;
		this.isSmart = isSmart;
		// TODO Auto-generated constructor stub
	}
	
	public void inserimentoDatiTelevisore() {
		Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Inserisci la dimensione in pollici: ");
        this.pollici = scan.nextLine();

        System.out.print("Scrivi true se il televisore è smart, altrimenti false ");
        this.isSmart = scan.nextBoolean();
        
        scan.close();
	}

	public String getPollici() {
		return pollici;
	}

	public void setPollici(String pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean smart) {
		this.isSmart = smart;
	}
}
