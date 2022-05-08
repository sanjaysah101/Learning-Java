/*
14. Write a program that includes more than ten string manipulation methods such as length(),concat(),trim() .
	Task 1 : Create a character array.
	Task 2 : Convert character array in String.
	Task 3 : Create a String object using literal.
	Task 4 : Create a String object using new keyword.
	Task 5 : Ask user to enter a name and store user’s name in String.
	Task 6 : Compare two Strings.
	Task 7 : Concat two Strings.
	Task 8 : Perform any ten String manipulation methods.
	Task 6 : Write comment for each important portion of code like data members’ declaration, methods, some important logic etc.
*/

import java.util.Scanner;
class Q14_String_manipulation{
    public static void main(String args[]){
        char arr[] = {'S', 'a', 'n', 'j', 'a', 'y'};       // Creating character array
        
        System.out.println(toString(arr)); // Converting charater array to string using function
        
        System.out.println(String.valueOf(arr)); // Converting charater array to string using valueOf method in String Class

        // Create a String object using literal
        String s = "Sanjay Sah";
        System.out.println(s);

        // Create a String object using new keyword.
        String st = new String("Sanjay");
        System.out.println(st);


        // Task 5 : Ask user to enter a name and store user’s name in String.
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String userName = myObj.nextLine();
        System.out.println("User Name: " + userName);

        // Task 6 : Compare two Strings.

        String a = "Hello";
        String b = "Hello";

        if (a == b){
            System.out.println(a + " is same as " + b);
        }

        // Task 7 : Concat two Strings.
        System.out.println(a + b);

        // Task 8 : Perform any ten String manipulation methods.
        
	    

    }
    public static String toString(char[] a){
        // Creating an object of String class
        String string = String.valueOf(a);
        return string;
    }
}