package OSF.naukaJava.etap1.loops;

public class NestedLoopsWorksCwiczenie3 {
    public static void main(String[] args) {
        //int k = 1;
        for (int i = 1; i < 5; i++) // (zewnętrzna pętla) ten blok zostanie uruchomiony 4 razy
        {
            //System.out.println("outer loop started");
            for (int j = 1; j <= i; j++) // wewnętrzna pętla
            {
                System.out.print(j);
                System.out.print("\t");
                //k++;
            }
            System.out.println("");
        }
    }

}
/*
        1
        1   2
        1   2   2
        1   2   2   3
*/