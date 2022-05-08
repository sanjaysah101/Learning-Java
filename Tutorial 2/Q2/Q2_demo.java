import java.util.Scanner;
// Creating Students Class
class Students{
    Scanner sc = new Scanner(System.in);
    // Creating Private Variables
    private int rollNo;
    private String name;
    int noOfSubjects = 3;
    // Declaring an array which stores marks of a students
    private float subMarks[] = new float[noOfSubjects];

    // Methods to get roll no
    public void getRollNo(){
        System.out.print("Enter Roll No: ");
        
        // rollNo = sc.nextInt()   // This will create input buffer and skip next line

        // rollNo = Integer.parseInt(sc.nextInt());  //--> Gives Error

        // reading the complete line for the integer
        // and converting it to an integer so that it will not create any buffer
        rollNo = Integer.parseInt(sc.nextLine());
    }

    // Methods to get name
    public void getName(){
        System.out.print("Enter Name: ");
        name = sc.nextLine();//#endregion();
    }

    // Methods to get Marks of subjects
    public void getSubMarks(){
        for(int i = 0; i<noOfSubjects; i++){
            System.out.print("Enter Subject "+(i+1)+" marks: ");
            subMarks[i] = sc.nextFloat();
        }
    }
    // Method to display name and roll no
    public void display(){
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Name No: "+ name);
    }
    // Method to compute total marks of a student
    public float totalMarks(){
        int totalMarks = 0;
        for(int i = 0; i<noOfSubjects; i++){
            totalMarks += subMarks[i];
        }
        return totalMarks;
    }
}

// Main Function
class Q2_demo{
    public static void main(String args[]){
        // Creating Student object of Students Class
        Students student = new Students();
        
        // Calling methods of Students class
        student.getRollNo();
        student.getName();
        student.getSubMarks();
        System.out.println();
        student.display();
        System.out.println("Total Marks: "+ student.totalMarks());
    }
}