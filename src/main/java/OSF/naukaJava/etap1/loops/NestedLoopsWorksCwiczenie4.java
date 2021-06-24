package OSF.naukaJava.etap1.loops;

public class NestedLoopsWorksCwiczenie4 {
    public static void main(String[] args) {
        int k = 3;
        for (int i = 1; i < 4; i++) // (zewnętrzna pętla) ten blok zostanie uruchomiony 4 razy
        {
            //System.out.println("outer loop started");
            for (int j = 1; j <= i; j++) // wewnętrzna pętla
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
                k++;
                k++;
            }
            System.out.println("");
        }
    }

}
/*
        3
        6   9
        12  15   18

*/