package np.edu.scst.lab5;

public class ObjectParamater {
    int a,b;

    public void objectPass(int i, int j){
        a = i;
        b = j;
        System.out.println("a:"  +  a + " b: " + b );
    }

    public static void main(String[] args) {
     ObjectParamater obj1 = new ObjectParamater();
     obj1.objectPass(2,3);

    }
}
