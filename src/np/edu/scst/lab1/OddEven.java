package np.edu.scst.lab1;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = input.nextInt();
        if(num % 2 == 0) {
            System.out.println("The entered number is even");
        }
        else {
            System.out.println("the entered number is odd");
        }
        System.out.println("Anil Bhattarai 15741");
    }
}
