
package myonlineshop;


public class Book extends Product {
    @Override
    public double price(double p){
    return p*0.4;
    }

    public Book() {
    }
    
    
}
