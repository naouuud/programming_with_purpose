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
        int[] count = new int[10 * n];
        int[] cumulative = new int[count.length];
        double[] fraction = new double[count.length];
        // set number of trials
        for (int i = 0; i < trials; i++) {
            // populate array birthdays
            for (int j = 0; j < birthdays.length; j++) {
                birthdays[j] = (int) (Math.random() * n);
            }
            // checking for duplicates
            boolean breakloop = false;
            for (int j = 1; !breakloop && j < birthdays.length; j++) {
                for (int k = 0; !breakloop && k < j; k++) {
                    if (birthdays[k] == birthdays[j]) {
                        count[j] += 1;
                        breakloop = true;
                    }
                }
            }
        }
        // populate cumulative and fraction
        for (int i = 1; i < count.length; i++) {
            cumulative[i] = cumulative[i - 1] + count[i];
        }
        for (int i = 0; i < count.length; i++) {
            fraction[i] = (double) cumulative[i] / trials;
        }
        // print persons count and fraction
        System.out.printf("%-6d %-8d %-12.1f%n", 1, count[0], fraction[0]);
        boolean stopprint = false;
        for (int p = 1; !stopprint; p++) {
            System.out.printf("%-6d %-8d %-12f%n", p + 1, count[p], fraction[p]);
            if (fraction[p] >= 0.5) {
                stopprint = true;
            }
        }
    }
}
