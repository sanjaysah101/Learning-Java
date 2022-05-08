// 4) Rearrange following code statements to get the given output. Also include comments for each important portion/statement.

// class Bank
// {  
// {
// return 0;
// }  
// }  

// class SBI extends Bank
// {  
// {
// return 8;
// }  
// }  

// class ICICI extends Bank
// {  
// {
// return 7;
// }  
// }  
// class AXIS extends Bank
// {  
// {
// return 9;
// }  
// }  
// int getRateOfInterest()
// int getRateOfInterest()
// int getRateOfInterest()
// int getRateOfInterest() 
// class Demo
// {  
// public static void main(String args[])
// {  
// SBI s=new SBI();  
// ICICI i=new ICICI();  
// AXIS a=new AXIS();  
// System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
// System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
// System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
// }	  
// }  

// Output:
// SBI Rate of Interest: 8
// ICICI Rate of Interest: 7
// AXIS Rate of Interest: 9

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest(){
        return 9;
    }
}

class Demo {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}