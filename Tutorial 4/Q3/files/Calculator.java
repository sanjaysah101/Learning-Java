// (3) Create a package named calculator, define class and add methods for addition,
// subtraction, division and multiplication. Import this package in another java file
// and access methods.

package calculator;
public class Calculator {
    long addition(int a, int b){
        return a + b;
    }
    long subtraction(int a, int b){
        return a - b;
    }
    long multiplication(int a, int b){
        return a * b;
    }
    long division(int a, int b){
        if(a > b){
            return a / b;
        }
        return 0;
    }
}


