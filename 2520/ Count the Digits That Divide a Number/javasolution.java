class CountDigits {
    public static void main(String[] args) {
        int[] testInput = {7, 121, 1248};
        for (int i : testInput) {
            System.out.printf("Output %d: %d\n", i, countDigits(i));
        }
    }

    //
    public static int countDigits(int num) {
        if (num <= 9) return 1;

        int newNum = num;
        int divisible = 0;
        while (newNum != 0) {
            if (num % (newNum % 10) == 0) {
                divisible++;
            }
            newNum /= 10;
        }

        return divisible;
    }
}