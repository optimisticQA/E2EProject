package OSF.naukaJava.kursPoPolsku;

public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // &&  -> true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub  -> true gdy jedno wyrważenie składowe jestr równe true
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false

        // ! negacja  -> zwraca wartość przeciwną do wyrważenia przed którm się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue && secondValue)); // true
    }

}
