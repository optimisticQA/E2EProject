package OSF.naukaJava.etap2.Exception;

//one try can be followed by multiple catch blocks
//catch should be an immdiate block after try (multiple catch blocks)

//Exception type - catch all kind of exception (general)

public class ExceptionFinally {

    public static void main(String[] args) {

        // try - catch Mechanism
        int b = 7;
        int c = 0;

        try {
            int arr[]=new int[5];
           // int k = b / c;
            System.out.println(arr[7]);
        }
        catch (ArithmeticException et){
            System.out.println("I catched the arithmetic exception");
        }

        catch (IndexOutOfBoundsException ets){
            System.out.println("I catched the IndexBound exception");
        }

        catch (Exception e) {
            System.out.println("I catched the error/exception");
        }
        finally {
            // this block is executed irrespective of exception thrown or not
        }

    }
}
