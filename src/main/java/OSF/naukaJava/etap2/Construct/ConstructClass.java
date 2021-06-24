package OSF.naukaJava.etap2.Construct;

public class ConstructClass {


    public ConstructClass()
    {
        System.out.println("I am the constructor");
    }



    public void getData()
    {
         System.out.println("I am the method");
    }

    //will not return values
    //name of constructor should be the class name

    public static void main(String[] args) {
        //compiler will call implict constructor if you have not defined constructor bloc
        //when ever you create an object costructor is called
        //block of code when ever an object is created
        ConstructClass cc = new ConstructClass();

    }
}
