package ecommercesystem;

public class Product {
    //SUPER CLASS
    protected int productID;
    protected String name;
    protected float price;
    protected int length;
  
   
    
    public Product(String name,int productID,float price){
        this.name=name;
        this.productID=productID;
        this.price=Math.abs(price);
    }
    public void setProduvrID(){
        if (productID>0)
            this.productID=productID;
        else 
            this.productID=Math.abs(productID);
    }
    public void setName(){
        this.name=name;
    }
    public void setPrice(){
         if (price>0)
            this.price=price;
        else 
            this.price=Math.abs(price);
    } 
    public int getProductID(){
        return productID;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
   
    }

