// 7) Interface fields are public, static and final by default, and methods are public and abstract.

// Write Missing statements for the following.

// interface Bank{  
//     float rateOfInterest();  
//     }  
//     class SBI implements Bank{  
//     //Missing Statement {return 9.15f;}  
//     }  
//     class PNB implements Bank{  
//     //Missing Statement {return 9.7f;}  
//     }  
//     class Demo{  
//     public static void main(String[] args){  
//     Bank s=//Missing Code;  
//     System.out.println("ROI: "+s.rateOfInterest()); 
//     Bank p=//Missing Code;   
//     System.out.println("ROI: "+p.rateOfInterest());  
//     }}  

//    Output:
//     ROI: 9.15
//     ROI: 9.7

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 9.15f;        
    }
}

class PNB implements Bank {
    public float rateOfInterest() {
        return 9.7f;        
    }
   
}

class Demo {
    public static void main(String[] args) {
        Bank s = new SBI();
        System.out.println("ROI: " + s.rateOfInterest());
        Bank p = new PNB();
        System.out.println("ROI: " + p.rateOfInterest());
    }
}