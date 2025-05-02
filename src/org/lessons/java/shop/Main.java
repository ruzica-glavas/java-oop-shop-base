package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto videogioco = new Prodotto("The Last of us", "Gioco di avventura", 60.55f,22);
        Prodotto console = new Prodotto("PlayStation 5", "Console creata da Sony", 512.50f, 22 );


        
        System.out.println("Codice random:" + videogioco.code);
        System.out.println("Nome prodotto:" + videogioco.nameProduct);
        System.out.println("Nome prodotto completo:" + videogioco.fullName());
        System.out.println("Descrizione prodotto:" + videogioco.description);
        System.out.println("Prezzo base prodotto:" + videogioco.price + " " + "euro");
        System.out.println("Prezzo prodotto con iva:" + String.format("%.2f",videogioco.priceIva()) + " " + "euro");

        
        System.out.println("Codice random:" + console.code);
        System.out.println("Nome prodotto:" +  console.nameProduct);
        System.out.println("Nome prodotto completo:" + console.fullName());
        System.out.println("Descrizione prodotto:" + console.description);
        System.out.println("Prezzo base prodotto:" + console.price + " " + "euro");
        System.out.println("Prezzo prodotto con iva:" + String.format("%.2f", console.priceIva()) + " " + "euro");
    }
}
