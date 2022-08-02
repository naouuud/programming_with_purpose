public class TrinomialDP {
    public static long trinomial(int n, int k) {
        long[][] c = new long[n+1][2*n+2];
        for (int i = 0; i <= n; i++) {
            c[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= 2 * i + 1; j++) {
                c[i][j] = c[i - 1][j] + c[i - 1][j - 1] + c[i - 1][j - 2];
            }
        }
        return c[n][n + 1 + k];
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}
