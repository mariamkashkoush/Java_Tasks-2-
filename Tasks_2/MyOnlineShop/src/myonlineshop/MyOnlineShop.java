
package myonlineshop;
import java.util.Scanner;


public class MyOnlineShop {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter number of books ");
        int no_books = input.nextInt();
        Product [] array = new ChildrenBook[no_books];
        
        
        double price,total=0;
        for(int i=0;i<no_books;i++){
        System.out.println("Enter the price of the book no "+(i+1));
         price=input.nextDouble(); 
         array[i]=new ChildrenBook(); 
         array[i].price(price); 
         total =total + array[i].price(price); 
          
        }
        System.out.println("The Total Price is = " + total);
        
        
        
        
        
        
    }
    
}
