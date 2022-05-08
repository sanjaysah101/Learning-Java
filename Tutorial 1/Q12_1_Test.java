/* 
Q. 11) Predict the output and add comments what each line of code Is doing.
class Test {
     public static void main(String[] args) {
        for(int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
      }
}

2. public class Switch{
    final static short x = 2;
    public static int y = 0;
    public static void main(String [] args) 
    {
        for (int z=0; z < 3; z++) 
        {
            switch (z) 
            {
                case x: System.out.print("0 ");
                case x-1: System.out.print("1 ");
                case x-2: System.out.print("2 ");
             }
         }
     }
}

*/

class Q12_1_Test {  // Test is the name of class. File name must be same as the class name in which main method presents
     public static void main(String[] args) { //public means this method can be called from any where. static means ........ void means it is not returning any thing. main is the main method in java from where JDR starts reading program. String means it taks string as argument. 
        for(int i = 0; true; i++) {    // This will iterate i from 0 to until condition is true, 
            System.out.println("Hello");     // This will print "Hello" on the console. 
            break;   // This will break for loop and exit from it
        }
      }
}