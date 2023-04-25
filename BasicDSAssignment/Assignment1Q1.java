package BasicDSAssignment;

import java.util.Scanner;
class ArmstrongOrNot{
    public boolean armstrongCheck(int num){
        int temp = num;
        String str = Integer.toString(temp);
        int len = str.length();
        temp = Integer.parseInt(str);
        int rem = 0;
        int sum = 0;
        while(temp != 0){
            rem = temp % 10;
            temp = temp / 10;
            sum += Math.pow(rem, len);
        }

        if(sum == num)
            return true;
        else
            return false;
    }
}
public class Assignment1Q1 {
    public static void main(String[] args){
        ArmstrongOrNot armstrongOrNot = new ArmstrongOrNot();
        Scanner sc = new Scanner(System.in);
        int armstrongNum = sc.nextInt();

        if(armstrongOrNot.armstrongCheck(armstrongNum))
            System.out.println(armstrongNum + " is an armstrong number");
        else
            System.out.println(armstrongNum + " is not an armstrong number");
    }
}