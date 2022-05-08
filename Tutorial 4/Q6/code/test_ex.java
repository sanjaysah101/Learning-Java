
import pack.test;

public class test_ex {
    public static void main(String[] args) {
        test t = new test();
        String s1, s2, s3;
        s1 = t.format(100000000);
        s2 = t.format(6745.5781);
        s3 = t.format1(342156.7299);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}