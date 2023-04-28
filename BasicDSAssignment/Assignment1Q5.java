package BasicDSAssignment;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc > 0 && ctc <= 180000){
            return ctc;
        }
        else if(ctc >= 181001 && ctc <= 300000){
            return ctc / 10;
        }
        else if(ctc >= 300001 && ctc <= 500000)
            return ctc / 5;
        else if(ctc >= 500001 && ctc <= 1000000)
            return (ctc * 3) / 10;
        return 0;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctc = sc.nextInt();
        TaxAmount obj = new TaxAmount();
        System.out.println(obj.calculateTaxAmount(ctc));
    }
}
