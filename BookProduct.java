
package ecommercesystem;

public class BookProduct extends Product{
    
    private String author;
    private String  publisher;

    public BookProduct( int productID, String name, float price, String author, String publisher) {
        super( name,  productID, price);
        this.author=author;
        this.publisher=publisher;
    }

    public void setAuthor(){
        this.author=author;
        
    }
    public void setPublisher(){
        this.publisher=publisher;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
}
