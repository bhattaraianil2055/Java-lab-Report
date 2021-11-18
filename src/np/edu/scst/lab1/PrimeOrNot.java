package np.edu.scst.lab1;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        if(checkPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        System.out.println("Pukar Upreti 15772");
    }

    public static boolean checkPrime(int num)
    {
        if(num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return  true;
    }
}
