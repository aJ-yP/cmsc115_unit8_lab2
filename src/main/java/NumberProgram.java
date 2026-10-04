public class NumberProgram {

    /**
     * Calculates the result for the given array of values.
     * Currently implemented to return the sum of all elements.
     *
     * @param values an array of integers
     * @return the computed integer result
     */
    public static int findResult(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int result = 0;
        for (int value : values) {
            result += value;
        }

        return result;
    }

    // Example main method for testing
    public static void main(String[] args) {
        int[] sampleValues = {5, 10, 15, 20};
        int output = findResult(sampleValues);
        System.out.println("The result is: " + output);
    }
}