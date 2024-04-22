
package ecommercesystem;



public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;
    
    
    public Cart(int customerId,int nProducts){
        this.customerId=Math.abs(customerId);
        this.nProducts=Math.abs(nProducts);
        this.products=new Product[nProducts];
        
    }

    
    public void setCustomerID(){
        this.customerId=Math.abs(customerId);
    }
    public void setNproducts(){
     this.nProducts=Math.abs(nProducts);   
    }
    public void setProducts(Product[] products) {
    this.products = new Product[nProducts];
    }
    public int getCustomerID(){
        return customerId;
    }
    public int getNproducts(){
        return nProducts;
    }
   
   public Product[] getProducts() {
    return products;
   }
    public void addProduct(Product product,int x){ //x will be the index of the array(nProducts)
         
        if ( x>=0&& x<nProducts) {
           products[x]=product;
        }
        else{
            System.out.println("Cart is Already Full");
        }
    }
    public void removeProduct(Product product){
        
        for(int i=0;i<nProducts;i++){
            if(products[i]==product){
                products[i]=null;
                break;              }      
            else
            System.out.println("Product isn't found in the Cart. ");
                                    }
                                               }

    
    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }
    public Order placeOrder(int orderId) {
   
    Order order = new Order(customerId, orderId, products , calculatePrice());
    return order;
}
}
     
     
        
    

