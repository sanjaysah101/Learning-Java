// Q-1 :
// Find type of exception occurs in given code.
// Rewrite code that handle Exception using try and catch block.
// public class ExceptionDemo1
// {  
//     public static void main(String args[])
//     {  
//         int number=50/0;  
//         System.out.println("number=" + number);  
//     }  
//   }

public class ExceptionDemo1
{  
    public static void main(String args[])
    {  
        try{
            int number=50/0;  
            System.out.println("number=" + number);  
        }catch(ArithmeticException e){
            // System.out.println(e);  
            System.out.println ("Can't be divided by Zero " + e);
        }
    }  
  }