package np.edu.scst.lab3;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int x = in.nextInt();
            System.out.print("Input the Second number: ");
            int y = in.nextInt();
            System.out.print("Input the third number: ");
            int z = in.nextInt();
            System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
            System.out.println("Pukar Upreti 15772");

    }

    public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
