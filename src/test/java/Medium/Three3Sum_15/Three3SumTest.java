package Medium.Three3Sum_15;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Three3SumTest {

    @Test
    public void testThreeSum() {

        int[] input1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output1 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertEquals(output1, Three3Sum.threeSum(input1));

        int[] input2 = {0, 1, 1};
        List<List<Integer>> output2 = List.of();
        assertEquals(output2, Three3Sum.threeSum(input2));

        int[] input3 = {0, 0, 0};
        List<List<Integer>> output3 = List.of(Arrays.asList(0, 0, 0));
        assertEquals(output3, Three3Sum.threeSum(input3));
    }
}