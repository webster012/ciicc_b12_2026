public class Task8 {

    public static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("Sum up to " + num + " = " + cumulativeSum);
            total += cumulativeSum;
        }

        return total;
    }

    public static void main(String[] args) {
        int total = sum(4, 5, 10);

        System.out.println("Total sum = " + total);
    }
}

