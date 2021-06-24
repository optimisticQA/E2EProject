package OSF.naukaJava.etap2.Super;

public class ChildDemo extends ParentDemo {

    String name = "Tester";

    public ChildDemo()
    {   super(); // this should be always be at first line
        System.out.println("child class constructor");
    }

    public void getString() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData()
    {
        super.getData();
        System.out.println("I am child class");
    }

    public static void main(String[] args) {

        ChildDemo cd = new ChildDemo();

        cd.getString();
        cd.getData();
    }
}
