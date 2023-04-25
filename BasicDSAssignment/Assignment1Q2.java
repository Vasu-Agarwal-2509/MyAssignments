package BasicDSAssignment;

import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min, int max){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i < max; i++) {
            int temp = i;
            String str = Integer.toString(temp);
            int len = str.length();
            temp = Integer.parseInt(str);
            int rem = 0;
            int sum = 0;
            while (temp != 0) {
                rem = temp % 10;
                temp = temp / 10;
                sum += Math.pow(rem, len);
            }

            if (sum == i)
                list.add(i);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
        int[] answerArray = obj.armstrongNumbersInRange(min, max);
        for (int i = 0; i < answerArray.length; i++) {
            System.out.print(answerArray[i] + " ");
        }
    }
}
