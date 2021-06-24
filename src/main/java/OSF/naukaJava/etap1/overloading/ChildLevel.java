package OSF.naukaJava.etap1.overloading;

import OSF.naukaJava.etap1.Inheritance.ChildClass;

//function overloading
//either argument count should be different or argument data type should be different
public class ChildLevel extends ChildClass {

    public void getData(int a){
        System.out.println(a);
    }

    public void getData(String a){
        System.out.println(a);
    }

    public void getData(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ChildLevel cl = new ChildLevel();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2,3);
    }
}