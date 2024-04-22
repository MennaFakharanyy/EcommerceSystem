
package ecommercesystem;

public class Customer  {
    private int customerID;
    private String name;
    private String address;
    public Customer(int customerID , String name , String address){
        this.customerID=customerID;
        this.name=name;
        this.address=address;
    }
    public void setCustomerID(){
     this.customerID=Math.abs(customerID);
    }
    public void setName(){
        this.name=name;
    }
    public void setAddress(){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getCustomerID(){
        return customerID;
    }
}
