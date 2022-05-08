/* 
1) Draw a real picture for single level inheritance. 
Perform following tasks.
Task 1: Create a class 
Task 2: Add few data members as private, protected and public
Task 3: Add few methods as public to work on defined data members
Task 4: Create another applicable class which inherits members from above class
Task 5: Add few data members as private, protected and public into second class
Task 6: Add few methods as public to work on defined data members into second class
Task 7: Create a Demo class with main method.
Task 8: Create at least two objects of a second class defined in Task 4 into main method and call all methods using that object.
Task 9: Write comment for each important portion of code like data members’ declaration, methods, some important logic etc.
Task 10: Summarize above solution in your own few words to visualize the solution to the end user.
*/

class Vehicle
{
    long VRN;
    String color;
    int noOfWheels;
    float fuel;
    long capacity;
    int speed = 0;
    void fuelAmount(float f)
    {
        /** This function returns fuel in liter */
        fuel = f;
    }
    void getFuelDetails(){
        System.out.println("Fuel of is "+fuel);
    }
    void capacity(long c)
    {
        capacity = c;
    }
    void toUp(int s){
        speed += s;
    }
    void toDown(int s){
        speed -= s;
    }
    void applyBrakes()
    {
        do{
            speed -= 1;
        }while(speed>0);
    }
}

class Car extends Vehicle{
    private float price = 100000.0f;

    void seePrice(){
        System.out.println("Price of Car is "+price);
    }
}
class Q1{
    public static void main(String args[]){
        Car BMW = new Car();
        BMW.seePrice();
        BMW.fuelAmount(10);
        BMW.getFuelDetails();
    }
}