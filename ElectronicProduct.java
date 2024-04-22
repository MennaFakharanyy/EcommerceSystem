
package ecommercesystem;

public class ElectronicProduct extends Product{
    private String brand;
    private int  warrantyPeriod;
    public void setBrand (){
        this.brand=brand;
    }
    public ElectronicProduct(int productID, String name, float price, String samsung, int par2){
        super( name,  productID, price);
        this.brand=brand;
        this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public void setWarrantyPeriod (){
        if ( warrantyPeriod > 0)
            this.warrantyPeriod= warrantyPeriod;
        else 
            this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public String getBrand(){
        return brand;
    }
    public int getWarrantyPeriod (){
        return warrantyPeriod;
    } 
}
