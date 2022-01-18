/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThueMorseBase {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] sequence = new int[2 * n];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int j = 1; j <= (int) (Math.log(n) / Math.log(2)); j++) {
            for (int i = 0; i < (int) (Math.pow(2, j)); i++) {
                sequence[(int) Math.pow(2, j) + i] = 1 - sequence[i];
            }
        }
        for (int m = 0; m < n; m++) {
            System.out.print(sequence[m] + " ");
        }
        System.out.println();
    }
}
