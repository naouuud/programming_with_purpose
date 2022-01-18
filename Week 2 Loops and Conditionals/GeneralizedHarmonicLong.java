/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonicLong {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int i = 1;
        double sum = 0.0;
        while (i <= n) {
            sum = sum + 1 / Math.pow(i, r);
            i = i + 1;
        }
        System.out.println(sum);
    }
}
