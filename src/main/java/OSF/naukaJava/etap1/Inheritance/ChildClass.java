package OSF.naukaJava.etap1.Inheritance;

public class ChildClass extends ParentClass {

    public void audiosystem(){
        System.out.println("new audio child");
    }

    public void engine(){
        System.out.println("new engine");
    }

    public void color(){
        System.out.println(color);
    }

    public static void main(String[] args) {
        ChildClass cd = new ChildClass();
        cd.color();
        cd.breakes();
        cd.audiosystem();//function overriding - both method same name same signature same parameters
    }
}
