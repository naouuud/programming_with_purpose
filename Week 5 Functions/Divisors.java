public class Divisors {
    /*
    public static int gcdLoop(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int half = b / 2;
        int gcd = 1;
        for (int i = 1; i <= half; i++) {
            if (b % i == 0) {
                int c = b / i;
                if (a % c == 0) {
                    gcd = c;
                    break;
                }
            }
        }
        return gcd;
    }
    */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) return 0;
        return ((a / Divisors.gcd(a, b)) * b);
    }
    public static boolean areRelativelyPrime(int a, int b) {
        return (Divisors.gcd(a, b) == 1);
    }
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (Divisors.areRelativelyPrime(n, i)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        StdOut.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        StdOut.println("totient(" + a + ") = " + totient(a));
        StdOut.println("totient(" + b + ") = " + totient(b));
    }
}
