package OSF.naukaJava.etap2.This;

public class ThisDemo {

    int a = 2;

    public void getData() {
        int a = 3;
        int b = a+this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        // this refers to curen object - object scope lies in class level
    }

    public static void main(String[] args) {

        ThisDemo td = new ThisDemo();
        td.getData();

    }
}
