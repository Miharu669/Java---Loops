package dev.vero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableTest {

    @Test
    public void testGenerateMultiplicationTable() {
        int n = 5;
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("5 x 1 = 5");
        expectedOutput.add("5 x 2 = 10");
        expectedOutput.add("5 x 3 = 15");
        expectedOutput.add("5 x 4 = 20");
        expectedOutput.add("5 x 5 = 25");
        expectedOutput.add("5 x 6 = 30");
        expectedOutput.add("5 x 7 = 35");
        expectedOutput.add("5 x 8 = 40");
        expectedOutput.add("5 x 9 = 45");
        expectedOutput.add("5 x 10 = 50");

        List<String> actualOutput = MultiplicationTable.generateMultiplicationTable(n);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMultiplicationTableWithDifferentInput() {
        int n = 3;
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("3 x 1 = 3");
        expectedOutput.add("3 x 2 = 6");
        expectedOutput.add("3 x 3 = 9");
        expectedOutput.add("3 x 4 = 12");
        expectedOutput.add("3 x 5 = 15");
        expectedOutput.add("3 x 6 = 18");
        expectedOutput.add("3 x 7 = 21");
        expectedOutput.add("3 x 8 = 24");
        expectedOutput.add("3 x 9 = 27");
        expectedOutput.add("3 x 10 = 30");

        List<String> actualOutput = MultiplicationTable.generateMultiplicationTable(n);

        assertEquals(expectedOutput, actualOutput);
    }
}
