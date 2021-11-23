package np.edu.scst.lab4;

public class ConstructorOverloading {
    public static void main(String[] args) {
        class Circle{
            final double center;
            final double radius;
            Circle(double center, double radius){
                this.center = center;
                this.radius = radius;
            }
            Circle(double radius){
                this.radius = radius;
                this.center = 3.24;
            }
            void display(){
                System.out.println("Radius " + radius + " Center " + center);
            }
        }
        Circle round = new Circle(10,5);
        Circle round2 = new Circle(10);
        round.display();
        round2.display();
    }

}
