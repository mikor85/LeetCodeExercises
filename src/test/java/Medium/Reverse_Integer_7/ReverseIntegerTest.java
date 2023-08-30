package Medium.Reverse_Integer_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {

        int x1 = 123;
        assertEquals(321, ReverseInteger.reverse(x1));
        assertEquals(321, ReverseInteger.reverseVersion2(x1));

        int x2 = -123;
        assertEquals(-321, ReverseInteger.reverse(x2));
        assertEquals(-321, ReverseInteger.reverseVersion2(x2));

        int x3 = 120;
        assertEquals(21, ReverseInteger.reverse(x3));
        assertEquals(21, ReverseInteger.reverseVersion2(x3));
    }
}