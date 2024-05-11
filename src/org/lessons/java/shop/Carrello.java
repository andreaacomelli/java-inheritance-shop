package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

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
        	System.out.println(smarphone);
        }
        else if(tipoProdotto.equals("televisore")){
        	televisore.inserimentoDati();
        	televisore.inserimentoDatiTelevisore();
        	
        	System.out.println(televisore);
        	
        	} 
        	else if(tipoProdotto.equals("cuffie")){
	        	cuffie.inserimentoDati();
	        	cuffie.inserimentoDatiCuffie();
	        	System.out.println(cuffie);
        	}
        scan.close();
   }
}
