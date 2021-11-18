package np.edu.scst.lab3;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        {
            int a, b, sum = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number:");
            a = s.nextInt();
            while(a > 0)
            {
                b = a % 10;
                sum = sum + b;
                a = a / 10;
            }
            System.out.println("Sum of Digits:"+sum);
            System.out.println("Pukar Upreti 15772");
        }
    }
}
