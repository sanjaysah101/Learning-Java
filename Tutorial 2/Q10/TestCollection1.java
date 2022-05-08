// 10)  The following program contains more than 10 errors. Correct the errors and execute a working version of the program. (Also include comments) The corrected version of the program should produce the given output:
 
 
// import java.util.*;
// class TestCollection1
// {
//  public static void main(String args[])
//  {
// 	boolean b1 = new boolean("TRUE");
// 	bool b2 = new bool("FLSE");
// 	System.out.println(b1.toString + " or " + b2.String());
// 	for (int j = 0; j < 16; ++j)
//   	System.out.print(Character.fordigit(j, 16));
// 	System.out.println();
// 	Integer i = new Integer(parseInt("10", 10));
// 	Long l = new Long(parseLong("20", 10));
// 	long m = l.longvalue() * i.longvalue();
// 	System.out.println(Long.toString(m));
// 	System.out.println(Float.MIN_VALUE);
// 	System.out.println(Double.MAX_VALUE);
 
//  }
// }
// Output:
// true or false
// 0123456789abcdef
// 200
// 1.4E-45
// 1.7976931348623157E308

 
 
import java.util.*;
import java.lang.*;
class TestCollection1
{
 public static void main(String args[])
 {
    boolean b1 = Boolean.parseBoolean("True");
    boolean b2 = Boolean.parseBoolean("TruE");

	System.out.println(b1 + " or " + b2);
	for (int j = 0; j < 16; ++j)
  	    System.out.print(Character.forDigit(j, 16));
	System.out.println();

	// Integer i = new Integer(parseInt("10", 10));
    Integer i = Integer.parseInt("+200", 16);
	Long l = Long.parseLong("20", 10);
	long m = l.longValue() * i.longValue();
	System.out.println(Long.toString(m));
	System.out.println(Float.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);
 
 }
}
