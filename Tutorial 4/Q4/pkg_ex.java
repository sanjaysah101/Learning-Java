// (4) Fill the blanks for following output.
// Output:

// import java.lang.math;
// ___________________________ //import packages by class name
// ___________________________
// ___________________________
// public class pkg_ex {
// public static void main(String[] args) {
// Vector v=____________;
// Random r=new Random();
// Date d=new Date(2012, 1, 14);
// v.addElement(100);
// v.___________(&quot;Java&quot;, 0);
// v.addElement(r._________);
// System.out.println(v);

// System.out.println(_________); // Access sqrt() method using classname
// System.out.println(_________________); // use date functions
// }
// }

// (4) Fill the blanks for following output.
// Output:

import java.lang.Math;
import java.util.Vector;
import java.util.Random;
import java.util.Date;

public class pkg_ex {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        Random r =new Random();
        Date d = new Date(2012, 1, 14);

        v.addElement(100);
        v.insertElementAt("Java", 0);
        // v.addElement(r._________);
        System.out.println(v);

        // System.out.println(_________); // Access sqrt() method using classname
        // System.out.println(_________________); // use date functions
    }
}