// Find type of exception occurs in given code.
// Rewrite code that handle Exception using try and catch block.
// public class ExceptionDemo2
// {
//     public static void main(String args[])
//     {  
//         int number;
//         number=Integer.parseInt("ABC123");
//         System.out.println(number);  
//     }
// }


public class ExceptionDemo2
{
    public static void main(String args[])
    {  
        int number;
        try {
            number=Integer.parseInt("ABC123");
            System.out.println(number);  
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println ("Number not found " + e);
        }
    }
}
