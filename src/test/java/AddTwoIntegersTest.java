import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class AddTwoIntegersTest {

    @Test
    public void testNullParameters() {
        LinkedList<Integer> result = AddTwoIntegers.addTwoNumbers(null, null);
        assertNull(result);
    }

    @Test
    public void testCarryOverAtFinal() {
        LinkedList<Integer> number1 = new LinkedList<Integer>();
        number1.add(2);
        number1.add(4);
        number1.add(3);
        number1.add(8);

        LinkedList<Integer> number2 = new LinkedList<Integer>();
        number2.add(5);
        number2.add(6);
        number2.add(4);
        number2.add(5);

        LinkedList<Integer> result = AddTwoIntegers.addTwoNumbers(number1, number2);

        assertEquals(7, result.get(0).intValue());
        assertEquals(0, result.get(1).intValue());
        assertEquals(8, result.get(2).intValue());
        assertEquals(3, result.get(3).intValue());
        assertEquals(1, result.get(4).intValue());

    }

    @Test
    public void testNumber1LessDigitsThanNumber2() {
        LinkedList<Integer> number1 = new LinkedList<Integer>();
        number1.add(0);
        number1.add(1);
        number1.add(1);

        LinkedList<Integer> number2 = new LinkedList<Integer>();
        number2.add(1);
        number2.add(4);
        number2.add(5);
        number2.add(3);

        LinkedList<Integer> result = AddTwoIntegers.addTwoNumbers(number1, number2);

        assertEquals(1, result.get(0).intValue());
        assertEquals(5, result.get(1).intValue());
        assertEquals(6, result.get(2).intValue());
        assertEquals(3, result.get(3).intValue());
    }

    @Test
    public void testNumber2LessDigitsThanNumber1() {
        LinkedList<Integer> number1 = new LinkedList<Integer>();
        number1.add(7);
        number1.add(8);
        number1.add(5);

        LinkedList<Integer> number2 = new LinkedList<Integer>();
        number2.add(2);
        number2.add(9);

        LinkedList<Integer> result = AddTwoIntegers.addTwoNumbers(number1, number2);

        assertEquals(9, result.get(0).intValue());
        assertEquals(7, result.get(1).intValue());
        assertEquals(6, result.get(2).intValue());
    }
}
