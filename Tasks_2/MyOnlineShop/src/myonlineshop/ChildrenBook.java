
package myonlineshop;


public class ChildrenBook extends Book {
    
    @Override
    public double price(double p) {
        return p*0.5 ; 
    }

    public ChildrenBook() {
    }
    
    
}
