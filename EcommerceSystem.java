
package ecommercesystem;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EcommerceSystem {

    public static void main(String[] args) {
       ElectronicProduct smartPhone =new ElectronicProduct(1, "SmartPhone", (float) 599.9,"Samsung",1);
       ClothingProduct T_Shirt = new ClothingProduct( 2, "T-shirt", (float) 19.99, "Medium", "Cotton");
       BookProduct oopBook = new BookProduct( 3, "OOP",(float) 39.99, "O'Reilly", "X Publications");
       JOptionPane.showMessageDialog(null,"Welcome to the E-commerse System! ");
        

        Scanner input = new Scanner(System.in);
        
        
        int customerId = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your ID"));
        
        
        String name = JOptionPane.showInputDialog("Please Enter Your Name");
        
        
        String address = JOptionPane.showInputDialog(null,"Please Enter customer address:");
           
        Customer c = new Customer(customerId, name, address);
        int nProducts = Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Products You Want To Add To Your Cart"));
        
        Product[] products = new Product[nProducts];
        
        Cart cart = new Cart(customerId,nProducts);
        
        for (int i = 0; i < nProducts; i++) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter product ID (1: smartphone, 2: T-shirt, 3: OOP):"));
            
            
            Product product=null;
            switch(choice){
                case 1:
                    product = new ElectronicProduct(1,"smart phone",599.9f,"Samsung",1);
                    cart.addProduct(product, i);
                    break;
                case 2:
                    product = new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");
                     cart.addProduct(product, i);
                    break;
                case 3:
                    product = new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications");
                     cart.addProduct(product, i);
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
                          }
               }
       
        int orderchoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Your total is $"+cart.calculatePrice()+" .Would you like to place the order? \n1- Yes\n 2- No"));
        
            if (orderchoice==1){
               
            Order order = cart.placeOrder(orderchoice);
            JOptionPane.showMessageDialog(null, "Here's your order's summary");
            order.printOrderInfo();
        } else {
            JOptionPane.showMessageDialog(null, "Thank you for your visit!");
        
            } 
    }
}  
