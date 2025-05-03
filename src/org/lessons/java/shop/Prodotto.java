package org.lessons.java.shop;

public class Prodotto{
    //Caratteristiche tipiche del prodotto (attributi)

    public int code;
    public String nameProduct;
    public String description;
    public float price;
    public int iva;

    //Capacità

    public Prodotto(String nameProduct, String description, float price, int iva){

        this.code= getRandom(1,100);
        this.nameProduct= nameProduct;
        this.description=description;
        this.price=price;
        this.iva=iva;

    }

    public int getRandom(int min, int max){
        int range = (max-min) + 1;
        int random = (int)((range*Math.random()+min));
        return random;
    }


    public float getPrice(){
        return price;
    }

    public float getPriceIva(){
        if(price !=0 && iva !=0){
            return price + (price*iva)/100;
        }
        return 0;
    }

    public String getFullName(){
        if(nameProduct != null && code !=0){
            return code + "-" + nameProduct;
        }
       return null;
    }

}


