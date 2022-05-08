/* 
5)  	Write Missing statements for the following.
import java.util.*; 
public class TestCollection
{ 
            public static void main(String args[])
            { 
             	ArrayList<String> al=new ArrayList<String>(); 
                        al.add("Ramesh"); 
                        al.add("Tejas"); 
                         //Missing Statement
                         al.add(1,"Virat"); 
                         System.out.println("element at 2nd position: "+al.get(2)); 
                         ListIterator<String> itr=al.listIterator(); 
                          System.out.println("traversing elements in forward direction..."); 
                           //Missing Statement
                            { 
                                      System.out.println(itr.next()); 
                            } 
                            System.out.println("traversing elements in backward direction..."); 
                            //Missing Statement
                            { 
                                       System.out.println(itr.previous()); 
                            } 
               } 
     } 
 
     Output:
     element at 2nd position: Tejas
     traversing elements in forward direction...
     Ramesh
     Virat  	
     Tejas
     Kajal
     traversing elements in backward direction...
     Kajal
     Tejas
     Virat
     Ramesh
*/
import java.util.*; 
public class TestCollection
{ 
    public static void main(String args[])
    { 
        ArrayList<String> al=new ArrayList<String>(); 
        al.add("Ramesh"); 
        al.add("Tejas"); 
        al.add("Kajal");
        al.add(1,"Virat"); 
        System.out.println("element at 2nd position: "+al.get(2)); 
        ListIterator<String> itr=al.listIterator(); 
        System.out.println("traversing elements in forward direction..."); 
        //Missing Statement
        for(int i = 0; i<al.size(); i++)
        { 
            System.out.println(itr.next()); 
        } 
        System.out.println("traversing elements in backward direction..."); 
        //Missing Statement
        for(int i = 0; i<al.size(); i++)
        { 
            System.out.println(itr.previous()); 
        } 
    } 
} 