class PrimeNumber {
    public static void main(String jlc[]) {
        int n = 3;
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not a prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not a prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + "is a prime");
            }
        }
    }
}
