
package ecommercesystem;

import javax.swing.JOptionPane;

public class Order {
 
    // Attributes
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    // Constructor
    public Order(int customerId, int orderId, Product[] products,float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice=Math.abs(totalPrice);
        //this.totalPrice = calculateTotalPrice(products);
    }

    // Method to calculate the total price of the order
    private float calculateTotalPrice(Product[] products) {
        float total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to print order information
    public void printOrderInfo() {
        JOptionPane.showMessageDialog(null,"Order Information:");
        //System.out.println("Order Information:");
        JOptionPane.showMessageDialog(null,"Order ID: " + orderId);
        //System.out.println("Order ID: " + orderId);
         JOptionPane.showMessageDialog(null,"Customer ID: " + customerId);
       // System.out.println("Customer ID: " + customerId);
       JOptionPane.showMessageDialog(null,"Products:");
       // System.out.println("Products:");
        for (Product product : products) {
            JOptionPane.showMessageDialog(null,"- " + product.getName() + " ($" + product.getPrice() + ")");
           // System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
         JOptionPane.showMessageDialog(null,"Total Price: " + totalPrice);
        //System.out.println("Total Price: " + totalPrice);
    }
}
