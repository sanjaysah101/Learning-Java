/* 
The following program contains more than 10 errors. Correct the errors and submit a working version of the program. (also include comments) The corrected version of the program should produce the following output:

public class Oops {
    public static void main(String[] args) {
        int x;
        System.out.println("x is " x);
        int x = 15.2;   // set x to 15.2
        System.out println("x is now + x");
        int y;   // set y to 1 more than x
        y = int x + 1;
        System.println("x and y are " + x + and + y);
        System.out.println(This program surely cannot )
        System.out.println("have any "errors" in it");
    }
}

Output:
x is 0
x is now 15
x and y are 15 and 16
This program surely cannot
Have any /"errors" in it
*/

public class Oops {
    public static void main(String args[]) {
        int x = 0;
        System.out.println("x is " + x);
        x = (int)15.2;   // set x to 15.2
        System.out.println("x is now " + x);
        int y;   // set y to 1 more than x
        y = x + 1;
        System.out.println("x and y are " + x + " and " + y);
        System.out.println("This program surely cannot ");
        System.out.println("have any \"errors\" in it");
    }
}