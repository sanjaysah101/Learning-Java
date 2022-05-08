// Write a program to demonstrate the use of switch statement.
import java.util.Scanner;

class Q5_Use_of_Switch_statement{
    public static void main(String args[]){
        Scanner my_obj = new Scanner(System.in);
        System.out.print("Enter Number 1 or 2: ");
        int num = my_obj.nextInt();
        switch(num){
            case 1:
                System.out.println("You are not eligible. ");
                break;
            case 2:
                System.out.println("You are eligible. ");
                break;
            default:
                System.out.println("Invalid Number!! ");
        }
    }
}