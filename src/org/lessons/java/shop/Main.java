package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto videogioco = new Prodotto("The Last of us", "Naughty Dog", 60.55f,22);
        Prodotto console = new Prodotto("PlayStation 5", "Sony", 512.50f, 22 );

        Prodotto tastiera = new Prodotto("Tastiera", "Logitech", 20.50f, 22 );


        
        System.out.println("Codice random:" + videogioco.getCode());
        //System.out.println("Nome prodotto:" + videogioco.nameProduct);
        System.out.println("Nome prodotto completo:" + videogioco.getFullName());
        //System.out.println("Descrizione prodotto:" + videogioco.description);
        System.out.println("Prezzo base prodotto:" + videogioco.getPrice() + " " + "euro");
        System.out.println("Prezzo prodotto con iva:" + String.format("%.2f",videogioco.getIva()) + " " + "euro");

        
        System.out.println("Codice random:" + console.getCode());
        //System.out.println("Nome prodotto:" +  console.nameProduct);
        System.out.println("Nome prodotto completo:" + console.getFullName());
        //System.out.println("Descrizione prodotto:" + console.description);
        System.out.println("Prezzo base prodotto:" + console.getPrice() + " " + "euro");
        System.out.println("Prezzo prodotto con iva:" + String.format("%.2f", console.getIva()) + " " + "euro");

        System.out.println("Nome prodotto:" +  tastiera.getNameProduct());
        System.out.println("Brand del prodotto:" + tastiera.getBrand());
        System.out.println("Prezzo base prodotto:" + tastiera.getPrice() + " " + "euro");
        System.out.println("Prezzo prodotto con iva:" + String.format("%.2f", tastiera.getIva()) + " " + "euro");
       
    }
}
