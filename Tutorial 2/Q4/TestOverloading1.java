/*
4)  Rearrange following code statements to get the given output. Also include comments for each important portion/statement.
 
class Adder
{ 
            static int add(int a,int b)
static double add(int a,double b)
static double add(double a,double b)
static int add(int a,int b,int c)
            	{
return res;
                            	res = a+b;
                            	int res;
            	} 
            	{
                            	res = a+b;
double res;
                            	return res;
            	} 
            	
            	{
                            	double res;
                            	return res;
res = a+b;
            	} 
            	
            	{
                            	int res;
                            	return res;
res=a+b+c;
            	} 
} 
class Multiplier
{ 
 
            	{
                            	int res;
                            	res=a*b;
                            	return res;
            	} 
            	{
                            	int res;
                            	res = a*b*c;
                            	return res;
            	} 
int mul(int a,int b,int c)
int mul(int a,int b)
 
 
} 
class TestOverloading1
{ 
            	public static void main(String[] args)
            	{ 
System.out.println(Adder.add(100.05,11.90));               	
System.out.println(Adder.add(10,10)); 
                            	System.out.println(Adder.add(100,100.11));
                            	System.out.println(Adder.add(10,11,10));
                            	 
 
System.out.println(m.mul(10,10,10)); 
                            	Multiplier m = new Multiplier();
                            	System.out.println(m.mul(10,11)); 
                         }
} 
Output:
20
31
200.11
111.95
110
1000
*/



class Adder
{ 
    static int add(int a,int b)
    {
        int res;
        res = a+b;
        return res;
    } 
    static double add(int a,double b)
    {
        double res;
        res = a+b;
        return res;
    } 
    static double add(double a,double b)
    {
        double res;
        res = a+b;
        return res;
    } 
    static int add(int a,int b,int c)
    {
        int res;
        res = a+b+c;
        return res;
    } 
            	
            	
} 

class Multiplier{
    int mul(int a,int b,int c){
        int res;
        res = a*b*c;
        return res;
    } 
    int mul(int a,int b){
        int res;
        res=a*b;
        return res;
    } 
} 


class TestOverloading1
{ 
    public static void main(String[] args){ 
        Multiplier m = new Multiplier();

        System.out.println(Adder.add(10,10)); 
        System.out.println(Adder.add(10,11,10));
        System.out.println(Adder.add(100,100.11));
        System.out.println(Adder.add(100.05,11.90));               	
                            	 
 
        System.out.println(m.mul(10,11)); 
        System.out.println(m.mul(10,10,10)); 
    }
} 