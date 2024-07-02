package dev.vero;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public static List<String> generateMultiplicationTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(n + " x " + i + " = " + (n * i));
        }
        return table;
    }

    public static void main(String[] args) {
        int n = 5;
        generateMultiplicationTable(n);
    }

    public static String testMultiplicationTable() {
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

        List<String> actualOutput = generateMultiplicationTable(n);

        if (expectedOutput.equals(actualOutput)) {
            return "Test passed!";
        } else {
            return "Test failed!";
        }
    }
}
