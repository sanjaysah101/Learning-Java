class Employee{
    private int empId;
    private String firstName, lastName;
    // private float empSalary;
    // private String fullName;

    Employee(){
        System.out.println("This is default constructors");
    }

    Employee(int id){
        empId = id;
        System.out.println("This is constructor with 1 argument i.e. " + empId);
    }
    Employee(String fn, String ln){
        firstName = fn;
        lastName = ln;
        System.out.println("This is constructor with 2 argument i.e. " + firstName + " " + lastName);
    }
    Employee(String fn, String ln, int id){
        firstName = fn;
        lastName = ln;
        empId = id;
        System.out.println("This is constructor with 3 argument i.e. " + firstName + " " + lastName+ " " + id);
    }
    String fullName(){
        return firstName + " " + lastName;
    }
}

public class Q3_demo{
    public static void main(String args[]){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1001);
        Employee emp3 = new Employee("Sanjay", "Sah");
        Employee emp4 = new Employee("Sanjay", "Sah", 1001);
        // System.out.println(emp2.fullName());
        System.out.println(emp3.fullName());
        System.out.println(emp4.fullName());
        // System.out.println(em1);

    }
}