// WAP to input any number n and print the product of all its digits.
//      For e.g. if n=235 then print 5*3*2=30

import java.util.Scanner;

class Q6_Product_of_digits{
    public static void main(String args[]){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = myobj.nextInt();
        int product = 1;
        while (num > 0){
            int rem = num % 10;
            product *= rem;
            num /= 10;
        }
        System.out.println("Product is " + product);
        
    }
}