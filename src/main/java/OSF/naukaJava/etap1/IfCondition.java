package OSF.naukaJava.etap1;

public class IfCondition {

    public static void main(String[] args) {
    //Warunek tak albo nie - dzieje się raz (nie zapętla się)
        if(5>2)
        // jeżeli jest jedna linia kodu to można usunąć nawiasy
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }

        for(int i=0; i<10;i=i+2)
        {
            if(i==8)
            System.out.println("Print 8 is displayed");
            else
                System.out.println("I didnot find");

        }
    }
}
