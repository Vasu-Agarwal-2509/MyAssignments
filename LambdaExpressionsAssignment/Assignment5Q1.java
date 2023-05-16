package LambdaExpressionsAssignment;

import java.util.Scanner;

interface AdditionOperation{
    public double addition(int num1, int num2);
}
interface SubtractionOperation{
    public double subtraction(int num1, int num2);
}
interface MultiplicationOperation{
    public double multiplication(int num1, int num2);
}
interface DivisionOperation{
    public double division(int num1, int num2);
}
public class Assignment5Q1 implements AdditionOperation, SubtractionOperation, MultiplicationOperation, DivisionOperation{
    public double addition(int num1, int num2){
        AdditionOperation additionObj = (n1, n2) -> n1 + n2;
        return additionObj.addition(num1, num2);
    }
    public double subtraction(int num1,int num2){
        SubtractionOperation subtractionObj = (n1, n2) -> n1- n2;
        return subtractionObj.subtraction(num1, num2);
    }
    public double multiplication(int num1,int num2){
        MultiplicationOperation multiplicationObj = (n1, n2) -> (n1 * n2);
        return multiplicationObj.multiplication(num1, num2);
    }
    public double division(int num1,int num2){
        DivisionOperation divisionObj = (n1, n2) -> {
            double ans = ((double) n1) / ((double) n2);
            return ans;
        };
        return divisionObj.division(num1, num2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        Assignment5Q1 obj = new Assignment5Q1();
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + obj.addition(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + obj.subtraction(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + obj.multiplication(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is: " + obj.division(num1, num2));
    }
}
