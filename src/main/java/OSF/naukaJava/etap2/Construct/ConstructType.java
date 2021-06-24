package OSF.naukaJava.etap2.Construct;

public class ConstructType {

    //Default

    public ConstructType() {
        System.out.println("I am the constructor");
        System.out.println("I am the constructor lecture 1");
    }

    //Parameterized constructor
    public ConstructType(int a, int b)
    {
        System.out.println("I am the parameterized constructor");
    }

    public ConstructType(String s)
    {
        System.out.println("I am the parameterized constructor string");
    }

    public void getData() {
        System.out.println("I am the method");
    }

    //will not return values
    //name of constructor should be the class name

    public static void main(String[] args) {
        //compiler will call implict constructor if you have not defined constructor bloc
        //when ever you create an object costructor is called
        //block of code when ever an object is created
        ConstructType cc = new ConstructType();
        ConstructType c = new ConstructType(4,5);
        ConstructType cs = new ConstructType("hello");

    }
}
