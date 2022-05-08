// 5) Rearrange following code statements to get the given output. Also include comments for each important portion/statement.

// class Animal {
//    public void move() {
//          }
// }

// class Dog extends Animal {
//    public void move() {
//    }
// }
// System.out.println("Animals can move");
// System.out.println("Dogs can walk and run");

// public class TestDog {

//    public static void main(String args[]) {
//       Animal a = new Animal();   // Animal reference and object
//       Animal b = new Dog();   // Animal reference but Dog object

//       a.move();   // runs the method in Animal class
//       b.move();   // runs the method in Dog class
//    }
// }

// Output:
// Animals can move
// Dogs can walk and run

// Solution:

class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}

// Output:
// Animals can move
// Dogs can walk and run