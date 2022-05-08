// 8)  	Write the output for the following code.
// import java.util.*;
// class TestCollection{
//  public static void main(String args[]){
 
//   HashSet<String> al=new HashSet<String>();
//   al.add("Kinjal");
//   al.add("Mona");
//   al.add("Pallavi");
//   al.add("Akshita");
 
//   Iterator<String> itr=al.iterator();
//   while(itr.hasNext()){
//    System.out.println(itr.next());
//   }
//  }
// }

import java.util.*;
class TestCollection{
 public static void main(String args[]){
 
  HashSet<String> al=new HashSet<String>();
  al.add("Kinjal");
  al.add("Mona");
  al.add("Pallavi");
  al.add("Akshita");
 
  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
