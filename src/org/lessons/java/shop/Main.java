package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    	Prodotto prodotto = new Prodotto("Nome Prodotto", "Marca Prodotto", 10.0, 22.0);
    	Smartphone smarphone = new Smartphone(0, null, null, 0, 0, 0, 0);
    	Televisore televisore = new Televisore(0, null, null, 0, 0, null, false);
    	Cuffie cuffie = new Cuffie(0, null, null, 0, 0, null, false);
    	
    	Scanner scan = new Scanner(System.in);
        
        System.out.println("Che tipo di prodotto vuoi aggiungere? (smartphone, televisore o cuffie)");
        String tipoProdotto = scan.nextLine().toLowerCase();

        if(tipoProdotto.equals("smartphone")){
        	prodotto.inserimentoDati();
        	smarphone.inserimentoDatiSmartphone();
        	
        	System.out.println("Informazioni Prodotto:");
            System.out.println(prodotto.getNome());
            System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
            System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
            System.out.println("Codice imei " + smarphone.getImei());
            System.out.println("Memoria: " + smarphone.getMemoriaGB() + "GB");
        }
        else if(tipoProdotto.equals("televisore")){
        	prodotto.inserimentoDati();
        	televisore.inserimentoDatiTelevisore();
        	
        	System.out.println("Informazioni Prodotto:");
            System.out.println(prodotto.getNome());
            System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
            System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
            System.out.println("Dimensione in pollici: " + televisore.getPollici());
            System.out.println("Smart: " + televisore.isSmart());
		}
        else if(tipoProdotto.equals("cuffie")){
        	prodotto.inserimentoDati();
        	cuffie.inserimentoDatiCuffie();
        	
        	System.out.println("Informazioni Prodotto:");
            System.out.println(prodotto.getNome());
            System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
            System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
            System.out.println("Colore: " + cuffie.getColore());
            System.out.println("Wireless: " + cuffie.isWireless());
    }
        scan.close();
   }
}
