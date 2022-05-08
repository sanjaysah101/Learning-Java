import java.util.Scanner;
class Students{
    int rollNO;
    String name;

    Scanner s1 = new Scanner(System.in);
    void getRollNO(){
        System.out.print("Enter Roll No: ");
        rollNO = s1.nextInt();
    }
    void getName(){
        System.out.print("Enter Name: ");
        name = s1.next();
    }
    void display(){
        System.out.print("Name: "+name + "\nRoll No: "+rollNO);
        System.out.println();
    }
}

class Demo{
    public static void main(String args[]){
        Students student[] = new Students[3];

        for(int i = 0; i < student.length; i++){
            student[i] = new Students();
            student[i].getRollNO();
            student[i].getName();
        }
        for(int i = 0; i < student.length; i++){

            student[i].display();
        }
    }
}