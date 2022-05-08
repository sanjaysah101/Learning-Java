/* 
Fill in the missing code:
public class DooBee {
public static void main (String[] args) {
int x=1;
while (x <______){
System.out._____ ("Doo");
System.out._____ (“Bee");
x = x+1;
}
if(x==____ ){
System.out.print("Do");
} 
}
}
Output
DooBeeDooBeeDo
*/

public class Q11_DooBee {
    public static void main (String args[]) {
        int x=1;
        while (x <3){
            System.out.print("Doo");
            System.out.print("Bee");
            x = x+1;
        }
        if(x==3){
            System.out.print("Do");
        }
    }
}