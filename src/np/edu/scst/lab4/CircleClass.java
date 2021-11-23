package np.edu.scst.lab4;

public class CircleClass {
    public static void main(String[] args) {
        class Circle{
            final double center;
            final double radius;
            Circle(double center, double radius){
                this.center = center;
                this.radius = radius;
            }
            void Display(){
                System.out.println("Radius " + radius + " Center " + radius);
            }
        }
        Circle round = new Circle(10,5);
        round.Display();
    }
}
