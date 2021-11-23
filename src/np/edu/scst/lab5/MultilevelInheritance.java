package np.edu.scst.lab5;

class Person{
    void talk(){System.out.println("Talking...");}
}
class Male extends Person{
    void male(){System.out.println("Male Talking...");}
}
class female extends Male{
    void female(){System.out.println("Female Talking...");}
}
class MultilevelInheritance{
    public static void main(String args[]){
        female f=new female();
        f.talk();
        f.male();
        f.female();
    }}