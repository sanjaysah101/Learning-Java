// 3) What do you understand about sub class constructor? Discuss the flow of constructor call from lowest sub class to top most super class. 
// Perform following tasks.
// Task 1: Create few classes to represent multilevel inheritance 
// Task 2: Add few data members as private, protected and public in all classes.
// Task 3: Add few constructors in all classes. Also call super class constructor from sub class
// Task 4: Inherits classes as per situation
// Task 5: Create a Demo class with main method.
// Task 6: Create an object of an appropriate class defined in Task 1 into main method and try to call all methods using that object. 
// Task 7: Write summary about constructor calling from sub class to supper class.
// Task 8: Note down errors if found and correct all errors with suitable changes by adding comment about the error and solution to that error.
// Task 9: Write comment for each important portion of code like data members’ declaration, methods, some important logic etc.
// Task 10: Summarize above solution in your own few words to visualize the solution to the end user.


class Student{
    public int rollno;
    protected String name;
    private String address;
    
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    void setAddress(String add){
        address = add;
    }
    
    void getAddress(){
        System.out.println("Student Address - " + address);
    }
    void showDetails(){
        System.out.println("Student Roll no - " + rollno);
        System.out.println("Student Name - " + name);
    }
}

class Marks extends Student{
    int sub1, sub2, sub3, totalMarks;
    Marks(int rollno, String name, int m1, int m2, int m3){
        super(rollno, name);
        sub1 = m1;
        sub2 = m2;
        sub3 = m3;
    }
    void getMarks(){
        showDetails();
        totalMarks = sub1 + sub2 + sub3;
        System.out.println("Total marks = " + totalMarks);
    }
}

class Percent extends Marks{
    float per;
    Percent(int rollno, String name, int m1, int m2, int m3){
        super(rollno, name, m1, m2, m3);
    }
    void getPercent(){
        getMarks();
        per = totalMarks/3;
        System.out.println("Percentage = " + per);
    }
}
public class Demo {
    public static void main(String args[])   {
        Percent p = new Percent(101, "Sanjay", 10, 20, 30);
        p.getPercent();
    }
}
