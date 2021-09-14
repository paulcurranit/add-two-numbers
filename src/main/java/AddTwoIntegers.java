import java.util.LinkedList;
import java.util.ListIterator;

public class AddTwoIntegers {

    public static LinkedList<Integer> addTwoNumbers(final LinkedList<Integer> number1, LinkedList<Integer> number2) {
        if (number1 == null || number2 == null){
            return null;
        } else{

            LinkedList<Integer> result = new LinkedList<>();

            ListIterator<Integer> number1Iterator = number1.listIterator();
            ListIterator<Integer> number2Iterator = number2.listIterator();

            boolean carry = false;
            while (number1Iterator.hasNext() || number2Iterator.hasNext() || carry) {
                Integer unit1 = 0;
                Integer unit2 = 0;
                if (number1Iterator.hasNext()) {
                    unit1 = number1Iterator.next();
                }
                if (number2Iterator.hasNext()) {
                    unit2 = number2Iterator.next();
                }

                int unitResult;
                if (carry)
                    unitResult = unit1 + unit2 + 1;
                else
                    unitResult = unit1 + unit2;

                if (unitResult > 9) {
                    unitResult -= 10;
                    carry = true;
                } else {
                    carry = false;
                }
                result.add(unitResult);
            }
            return result;
        }
    }
}
