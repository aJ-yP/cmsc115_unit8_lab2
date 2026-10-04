public class NumberProgram {

    /**
     * Returns the largest integer in the given array.
     *
     * @param values an array of integers
     * @return the maximum integer found, or Integer.MIN_VALUE if the array is null or empty
     */
    public static int findResult(int[] values) {
        if (values == null || values.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }

    // Example main method for testing
    public static void main(String[] args) {
        int[] sampleValues = {12, 45, 7, 89, 23, 56};
        System.out.println("The largest integer is: " + findResult(sampleValues));

        int[] emptyArray = {};
        System.out.println("Result for empty array: " + findResult(emptyArray));
    }
}