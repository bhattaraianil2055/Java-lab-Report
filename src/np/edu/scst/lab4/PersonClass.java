package np.edu.scst.lab4;

public class PersonClass {
    public static void main(String[] args) {
        class Person{
            String name;
            int age;
            double Salary;
            Person(String name, int age, double Salary){
                this.name = name;
                this.age = age;
                this.Salary = Salary;
            }
            void Display() {
                System.out.println("Name: " + name +  " Age: " + age + "Salary: " + Salary);
            }
        }
        Person pukar = new Person("Pukar Upreti", 24, 50000.00);
        pukar.Display();
    }
}
