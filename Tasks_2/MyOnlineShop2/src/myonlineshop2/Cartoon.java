
package myonlineshop2;


public class Cartoon extends Book {
    @Override
    public double price (double p){
        return p*0.6;
    }

    public Cartoon() {
    }
    
}
