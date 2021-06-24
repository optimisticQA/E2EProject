package OSF.naukaJava.etap1.AbstractClasses;

public class ChildEmirates extends ParentAirCraft {

    public static void main(String[] args){
        ChildEmirates c = new ChildEmirates();
        c.engine();
        c.safetyGuidelines();
        c.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color on the body");
    }
}
