import java.util.Scanner;
class Students{
    Scanner sc = new Scanner(System.in);
    private int rollNo;
    private String name;
    public void getRollNo(){
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
    }
    public void getName(){
        System.out.print("Enter Name: ");
        name = sc.next();
    }
    public void display(){
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Name No: "+ name);
    }
}

class Q1_demo{
    public static void main(String args[]){
        Students student[] = new Students[3];

        for(int i = 0; i < student.length; i++){
            student[i] = new Students();
            student[i].getRollNo();
            student[i].getName();
        }
        for(int i = 0; i < student.length; i++){

            student[i].display();
        }
    }
}