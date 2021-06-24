package OSF.naukaJava.etap1.loops;

public class NestedLoopsWorks {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) // (zewnętrzna pętla) ten blok zostanie uruchomiony 4 razy
        {
            System.out.println("outer loop started");
            for (int j = 1; j <= 4; j++) // wewnętrzna pętla
            {
                System.out.println("inner loop");
            }
            System.out.println("outer loop finished");
        }
    }
}
