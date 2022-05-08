// 2) Perform following tasks.
// Task 1: Create few classes to represent multilevel inheritance 
// Task 2: Add few data members as private, protected and public in all classes.
// Task 3: Inherits classes as per situation
// Task 3: Create a Demo class with main method.
// Task 4: Create an object of an appropriate class defined in Task 1 into main method and try to call all methods using that object.
// Task 5: Note down errors if found and correct all errors with suitable changes by adding comment about the error and solution to that error.
// Task 6: Write comment for each important portion of code like data members’ declaration, methods, some important logic etc.
// Task 7: Summarize above solution in your own few words to visualize the solution to the end user.

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class MultiLevel {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
