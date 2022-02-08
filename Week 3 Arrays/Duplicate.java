/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Duplicate {
    public static void main(String[] args) {
        int[] x = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * x.length);
        }
        int[] t = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            t[i] = x[i];
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    x[j] = 1000001;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-6d %-6d%n", t[i], x[i]);
        }
    }
}
