public class max_min {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 1, 9, 5};

        int max = numbers[0];
        int min = numbers[0];

        // loop through array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
