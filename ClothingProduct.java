
package ecommercesystem;

public class ClothingProduct extends Product{
    private String size;
    private String fabric;

    public ClothingProduct(int productID, String name, float price, String size, String fabric) {
        super (name, productID , price);
        
        this.size = size;
        this.fabric = fabric;
    }


  
    public void setSize (){
        this.size=size;
        
    }
    public void setFabric (){
        this.fabric=fabric;
    }
    public String gerSize (){
        return size;
    }
    public String getFabric (){
        return fabric;
    }
}
