/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] birthdays = new int[n];
        for (int i = 0; i < n; i++) {
            birthdays[i] = (int) (Math.random() * n);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(birthdays[i] + " ");
        }
        System.out.println();
    }
}
