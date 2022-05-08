// (1) Make a meaningful program by Performing following tasks and know about
// Packages.
// Task 1 : Import any three built-in packages.
// Task 2 : Make object of class for each imported package.
// Task 3 : Access methods of each class through objects.
// Task 4 : Comment for each method used.

import java.util.Scanner;
import java.lang.Math;
import java.io.Console;

public class Demo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter and number: ");
        double num = myObj.nextDouble();
        double squareOfNum =  Math.sqrt(num);

        Console cons = System.console();
        System.out.println("Enter your favorite color");
        String color;
        color = cons.readLine();
        System.out.println("Favorite color is " + color);
        System.out.println("Square root of  " + num + " is " + squareOfNum);


    }
}
