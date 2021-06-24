package OSF.naukaJava.etap1.Arrays;


public class InterviewMaxNumber {

    /*
    2 4 5

    3 0 7

    1 2 9

     */

    public static void main(String[] args) {


        int abc[][] = {{2, 4, 10}, {3, 0, 7}, {1, 2, 2}};
        int max = abc[0][0];



        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (abc[i][j] > max) {
                    max = abc[i][j];
                }
            }
        }
        System.out.println(max);

    }


}
