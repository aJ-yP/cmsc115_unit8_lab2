public class NumberProgram {

    /**
     * Returns the largest integer in the given array.
     *
     * @param values an array of integers
     * @return the maximum integer found in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findResult(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
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
        int largest = findResult(sampleValues);
        System.out.println("The largest integer is: " + largest);
    }
}