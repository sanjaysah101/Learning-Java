// Question: 
// (5) Find errors from following program.
// // file named a.java
// package pack;
// public class a{
// public void msg(){System.out.println(&quot;Hello&quot;);}
// public void add(int num1,int num2)
// {
// return num1+num2;
// }
// }
// //file named b.java
// class b{
// public static void main(String args[]){
// A obj = new A();
// ob.msg();
// System.out.println(&quot;30+20=&quot;+obj.add(30, 20));
// }
// }

// Solution

// file named a.java
package pack;

public class A {
    public void msg(){
        System.out.println("Hello");
    }
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
