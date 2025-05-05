package org.lessons.java.shop;

public class Prodotto{
    //Caratteristiche tipiche del prodotto (attributi)

    private int code;                //Modifico il livello di accessibilità degli attributi
    private String nameProduct;
    //private String description;
    private String brand;
    private float price;
    private int iva;

    //Capacità

    public Prodotto(String nameProduct,  /*String description*/ float price, int iva){

        this.code= getRandom(1,100);
        this.nameProduct= nameProduct;
        //this.description=description;
        this.price=price;
        this.iva=iva;

    }

    public Prodotto(String nameProduct, String brand, float price, int iva){  //Secondo costruttore
        this.nameProduct=nameProduct;
        this.brand=brand;
        this.price=price;
        this.iva=iva;
    }

    private int getRandom(int min, int max){  //Cambio da public a private così da avere il codice solo in lettura
        int range = (max-min) + 1;
        int random = (int)((range*Math.random()+min));
        return random;
    }

    public int getCode(){
        return this.code;
    }

    public String getNameProduct(){
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct){
        this.nameProduct=nameProduct;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    
    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public float getIva(){
        if(price !=0 && iva !=0){
            return price + (price*iva)/100;
        }
        return 0;
    }

    public void setIva(int iva){
        this.iva=iva;
    }

    public String getFullName(){
        if(nameProduct != null && code !=0){
            return code + "-" + nameProduct;
        }
       return null;
    }

}


