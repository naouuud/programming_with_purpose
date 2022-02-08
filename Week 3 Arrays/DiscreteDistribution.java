/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int[] s = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            s[i] = s[i - 1] + a[i];
        }
        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * s[args.length - 1]);
            for (int i = 0; i < args.length; i++) {
                if (r < s[i]) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

