package np.edu.scst.lab2;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,1,2,4};
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Pukar Upeti 15772");
    }

}
