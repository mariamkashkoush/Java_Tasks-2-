
package myonlineshop2;

import java.util.Scanner;


public class MyOnlineShop2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of books ");
        int no_books = input.nextInt();
        Product [] array = new Book[no_books+1];
        
        double price,total=0;
        for(int i=0;i<no_books;i++){          
            System.out.println("Enter the price of the childrenbook no "+(i+1));
            price=input.nextDouble(); 
            array[i]=new ChildrenBook(); 
            array[i].price(price);
            total =total + array[i].price(price);
           }
        
        System.out.println("Enter the price of the Cartoon ");
        double cartoon_price = input.nextDouble();
        array[no_books] = new Cartoon();
        array[no_books].price(cartoon_price);
        total =total + array[no_books].price(cartoon_price);
          
        System.out.println("The Total Price is = " + total);
        
        }   
    }
        
        

         
        
         
         
         
         
  
