/*
Write a program to perform following tasks.
    Task 1 : Declare one static variable.
    Task 2 : Take at least one input from user and store it in variable.
    Task 3 : Perform type casting on any variable.
    Task 4 : Add at least one control statement.
    Task 5 : Add at least one loop.
    Task 6 : Write comment for each important portion of code like data members’ declaration, methods, some important logic etc.
    Task 7: Summarize above solution in your own few words to visualize the solution to the end user.
*/
import java.util.Scanner;

class Q13_Perform_task{
    static float x;
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = myObj.nextFloat();
        System.out.println("x = " + x);

        int y = (int)x;
        System.out.println("y = " + y);
        if (x == y){
            System.out.println(x + " is equal to " + y + " in java");
            for(int i = 0; i < y; i++){
                System.out.println(i);
            }
        }
        else
            System.out.println(x + " does not equal to " + y + " in java");

    }
}