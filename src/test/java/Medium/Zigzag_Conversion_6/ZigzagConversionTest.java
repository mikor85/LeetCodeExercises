package Medium.Zigzag_Conversion_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigzagConversionTest {

    @Test
    public void testConvert() {

        String s1 = "PAYPALISHIRING";
        assertEquals("PAHNAPLSIIGYIR", ZigzagConversion.convert(s1, 3));

        String s2 = "PAYPALISHIRING";
        assertEquals("PINALSIGYAHRPI", ZigzagConversion.convert(s2, 4));

        String s3 = "A";
        assertEquals("A", ZigzagConversion.convert(s3, 1));

        String s4 = "AB";
        assertEquals("AB", ZigzagConversion.convert(s4, 1));
    }
}