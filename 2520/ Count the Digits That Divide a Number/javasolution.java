class CountDigits {
    public static void main(String[] args) {
        //
    }

    // Submitted 2023-08-26
//    public static int countDigits(int num) {
//        if (num <= 9) return 1;
//
//        int newNum = num;
//        int divisible = 0;
//        while (newNum != 0) {
//            if (num % (newNum % 10) == 0) {
//                divisible++;
//            }
//            newNum /= 10;
//        }
//
//        return divisible;
//    }

    // Submitted 2023-08-26
    public static int countDigits(int num) {
        int newNum = num, divisible = 0;
        while (newNum > 0) {
            if (num % (newNum % 10) == 0) {
                divisible++;
            }
            newNum /= 10;
        }
        return divisible;
    }
}