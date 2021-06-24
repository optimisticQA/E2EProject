package OSF.naukaJava.etap2.Exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        // try - catch Mechanism
        int b = 7;
        int c = 0;

        try {
            int k = b / c;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("I catched the error/exception");
        }

    }
}
