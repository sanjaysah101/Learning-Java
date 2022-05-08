// (6) Correct the output.
// //test.java
// package pack;
// public class test {
// public static String format(int num)
// {
// String s=String.format(&quot;%,d&quot;, num);
// return s;
// }
// public static String format(double num)
// {
// String s=String.format(&quot;%.2f&quot;, num);
// return s;
// }
// public static String format1(double num)
// {
// String s=String.format(&quot;%,.2f&quot;, num);

// return s;
// }
// }
// //test_ex.java
// import pack.test;
// public class test_ex {
// public static void main(String[] args) {
// test t=new test();
// String s1,s2,s3;
// s1=t.format(100000000);
// s2=t.format(6745.5781);
// s3=t.format1(342156.7299);
// System.out.println(s1);
// System.out.println(s2);
// System.out.println(s3);
// }
// }
// Output:
// 1,00,00,00,00
// 6745.57
// 342156.7299

package pack;

public class test {
    public static String format(long num)
    {
        String s=String.format("%.ld", num);
        return s;
    }

    public static String format(double num)
    {
        String s=String.format("%.2f", num);
        return s;
    }

    public static String format1(double num)
    {
        String s=String.format("%.2f", num);
        return s;
    }
}