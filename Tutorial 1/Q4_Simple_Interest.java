// 4. Write a program to find the simple interest and print it.
import java.util.Scanner;  // Import the Scanner class

class Q4_Simple_Interest {
    public static void main(String args[]){
        Scanner SI_Obj = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        int principle = SI_Obj.nextInt();

        System.out.print("Enter Time: ");
        int time = SI_Obj.nextInt();

        System.out.print("Enter Rate: ");
        int rate = SI_Obj.nextInt();
 
        float total_interest = simpleInterest(principle, time, rate);

        System.out.println("Interest: " + total_interest);
        System.out.println("Total Amount: " + (total_interest + principle));
    }

    static float simpleInterest(int p, int t, int r){
        return (p * t * r)/100;
    }
}