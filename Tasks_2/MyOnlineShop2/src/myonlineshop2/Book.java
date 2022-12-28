
package myonlineshop2;


public class Book implements Product {
    @Override
    public double price(double p){
    return p*0.4;
    }

    public Book() {
    }
    
    
}
