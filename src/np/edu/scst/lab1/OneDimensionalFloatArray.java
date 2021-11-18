package np.edu.scst.lab1;

public class OneDimensionalFloatArray {
    public static void main(String[] args) {
        float[] values= new float[10];
        for(int i = 1; i< 10; i ++){
            values[i] = i;
        }
        for(float value: values)
            System.out.println(value);
            System.out.println("Pukar Upreti 15772");
    }
}
