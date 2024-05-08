package org.lessons.java.shop;
import java.util.*;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	private static final Random random = new Random();
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		
		this.codice = generaCodice();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

    
    public void inserimentoDati() {
    	Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il nome del prodotto: ");
        this.nome = scan.nextLine();

        System.out.print("Inserisci la marca del prodotto: ");
        this.marca = scan.nextLine();

        System.out.print("Inserisci il prezzo del prodotto: ");
        this.prezzo = scan.nextDouble();

        System.out.print("Inserisci l'IVA del prodotto: ");
        this.iva = scan.nextDouble();
	}
    
    protected int generaCodice() {
		return random.nextInt(100) + 1;
	}

	public int getCodice() {
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

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	// Metodo per calcolare il prezzo base (senza IVA)
    public double getPrezzoBase() {
        return prezzo;
    }

    // Metodo per calcolare il prezzo con IVA
    public double getPrezzoConIva() {
        return prezzo * (1 + iva/100);
    }

    // Metodo per ottenere il nome esteso (codice-nome)
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
}
