/*
12. Predict the output and add comments what each line of code Is doing.

public class Q12_1_Switch{
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
public class Q12_2_Switch{
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