package OSF.naukaJava.etap1.Arrays;

//Arrays

public class ArraysTwoWays {

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
        System.out.println();

        // Kolejna metoda deklarowania tablicy

        int b[] = {1,4,3,5,7};

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]); // Retrive valuse present in this array
        }
    }

}
