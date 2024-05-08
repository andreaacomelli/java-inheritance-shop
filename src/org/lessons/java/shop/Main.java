package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Smartphone smarphone = new Smartphone(0, null, null, 0, 0, 0, 0);
    	Televisore televisore = new Televisore(0, null, null, 0, 0, null, false);
    	Cuffie cuffie = new Cuffie(0, null, null, 0, 0, null, false);
    	
    	Scanner scan = new Scanner(System.in);
        
        System.out.println("Che tipo di prodotto vuoi aggiungere? (smartphone, televisore o cuffie)");
        String tipoProdotto = scan.nextLine().toLowerCase();

        if(tipoProdotto.equals("smartphone")){
        	smarphone.inserimentoDati();
        	smarphone.inserimentoDatiSmartphone();
        	System.out.println("Informazioni Prodotto:");
            System.out.println(smarphone.getNome());
            System.out.println("Prezzo base: " + smarphone.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + smarphone.getPrezzoConIva());
            System.out.println("Nome esteso: " + smarphone.getNomeEsteso());
            System.out.println("Codice imei " + smarphone.getImei());
            System.out.println("Memoria: " + smarphone.getMemoriaGB() + "GB");
        }
        else if(tipoProdotto.equals("televisore")){
        	televisore.inserimentoDati();
        	televisore.inserimentoDatiTelevisore();
        	
        	System.out.println("Informazioni Prodotto:");
            System.out.println(televisore.getNome());
            System.out.println("Prezzo base: " + televisore.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + televisore.getPrezzoConIva());
            System.out.println("Nome esteso: " + televisore.getNomeEsteso());
            System.out.println("Dimensione in pollici: " + televisore.getPollici());
            
            if(televisore.isSmart() == true) {
            
            System.out.println("Il televisore è smart ");
            
			}else {
				System.out.println("Il televisore non è smart ");
			}
        }
           
        else if(tipoProdotto.equals("cuffie")){
        	cuffie.inserimentoDati();
        	cuffie.inserimentoDatiCuffie();
        	
        	System.out.println("Informazioni Prodotto:");
            System.out.println(cuffie.getNome());
            System.out.println("Prezzo base: " + cuffie.getPrezzoBase());
            System.out.println("Prezzo con IVA: " + cuffie.getPrezzoConIva());
            System.out.println("Nome esteso: " + cuffie.getNomeEsteso());
            System.out.println("Colore: " + cuffie.getColore());
            if(cuffie.isWireless() == true) {
                
                System.out.println("Le cuffie sono wireless");
                
    			}else {
    				System.out.println("le cuffie hanno il cavo");
    			}
    }
        scan.close();
   }
}
