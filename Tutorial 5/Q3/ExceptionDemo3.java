/*Create array of numbers with size= 5.
try to access element of index 10 and find is there any exception occurs?
Write code to handle exception. */
public class ExceptionDemo3 {
    public static void main(String args[]){
        int a[] = {1, 2, 3, 4, 5};
        try{
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
