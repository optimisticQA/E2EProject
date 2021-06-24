package OSF.naukaJava.etap1.Arrays;

//Arrays

public class ArraysDemo {

    public static void main(String[] args) {

        //   int a;
        //   a=4;
        // - A container whitch stores multiple values of same data type

        int a[] = new int[5]; // Declares an aray and allocates memory for the values
        a[0] = 2;
        a[1] = 6;
        a[2] = 1;
        a[3] = 9;
        a[4] = 12; // Initialised values into that array

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Retrive valuse present in this array
        }
    }

}
