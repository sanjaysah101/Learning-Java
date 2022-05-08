// 6) Write system generated error messages and summary of the errors in your own words for the following code. Also correct the code to get the given output.

// final class Car
// {
//  final int speedlimit=100;//final variable  
//  void run(){  
//   speedlimit=400;   
//  }
// }

// class Maruti extends Car
// {
//     void run(){System.out.println("running safely with 120kmph");}
// }
// class Bike{
//   final void run(){System.out.println("running");}
// }

// class Honda extends Bike{
//    void run(){System.out.println("running safely with 80kmph");}
// }

// class Demo
// {
//    public static void main(String args[])
//   {
//    Car c = new Car();
//    c.run();

//    Maruti m = new Maruti();
//    m.run();

//    Honda honda= new Honda();
//    honda.run();
//    }
// }
// Output:
// Car running safely with 100kmph
// Maruti running safely with 120kmph
// Bike running

class Car {
    final int speedlimit = 100;// final variable
    void run(){
    // speedlimit=400;
        System.out.println("running safely with 100kmph");
    }
}

class Maruti extends Car {
    void run() {
        System.out.println("running safely with 120kmph");
    }
}

class Bike {
     void run() {
        System.out.println("Bike running");
    }
}

class Honda extends Bike {
    // void run() {
    //     System.out.println("running safely with 80kmph");
    // }
}

class Demo {
    public static void main(String args[]) {
        Car c = new Car();
        c.run();

        Maruti m = new Maruti();
        m.run();

        Honda honda = new Honda();
        honda.run();
    }
}