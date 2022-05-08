// 1. Write a program to print your profile.
class Q1_Profile{
    public static void main(String args[]){
        String name, city, state, country, email, higher_Degree;
        name = "Sanjay Kumar Sah";
        city = "Rajkot";
        state = "Gujrat";
        country = "India";
        email = "ssah007@rku.ac.in";
        higher_Degree = "B Tech";
        int age = 21;
        long phone_no = 8797421521l;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Phone Number: " + phone_no);
        System.out.println("Email: " + email);
        System.out.println("Higher Degree: " + higher_Degree);
    }
}