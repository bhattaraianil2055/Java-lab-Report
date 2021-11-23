package np.edu.scst.lab5;

public class MethodOverloading {
    String firstName;
    String lastName;
    MethodOverloading(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    MethodOverloading(String firstName){
        this.firstName = firstName;
                this.lastName = "upreti";
    }
    void Display(){
        System.out.println("FirstName " + firstName + " LastName " + lastName );
    }
    void Display(String firstName){
        System.out.println("first name "+firstName);
    }

    public static void main(String[] args) {
        MethodOverloading t = new MethodOverloading("Pukar");
        MethodOverloading t2 = new MethodOverloading("pukar", "xyz" );
        t2.Display();

    }
}
