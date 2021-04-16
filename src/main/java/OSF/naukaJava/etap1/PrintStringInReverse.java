package OSF.naukaJava.etap1;

public class PrintStringInReverse {

    public static void main(String[] args) {
//String in reverse - odwrócony string

        String s = "madam";
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            //System.out.println(s.charAt(i));
            t = t+ s.charAt(i);
        }
        System.out.println(t);
        System.out.println(s);

        if(s==t) {
            System.out.println("String to palindrom");
            //if is palindrome
        }
    }
}
