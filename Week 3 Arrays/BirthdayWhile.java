/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
// alternative version of the program Birthday.java focusing on while loops
public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] birthdays = new int[n];
        int[] count = new int[birthdays.length];
        int[] cumulative = new int[birthdays.length];
        double[] fraction = new double[birthdays.length];
        // set number of trials
        for (int i = 0; i < trials; i++) {
            // populate array birthdays
            for (int j = 0; j < birthdays.length; j++) {
                birthdays[j] = (int) (Math.random() * n);
            }
            // checking for duplicates
            int j = 1;
            boolean breakbigloop = false;
            while (!breakbigloop && j < birthdays.length) {
                int k = 0;
                boolean breakloop = false;
                while (!breakloop && k < j) {
                    if (birthdays[k] != birthdays[j]) {
                        k += 1;
                    }
                    else {
                        count[j] += 1;
                        breakloop = true;
                        breakbigloop = true;
                    }
                }
                j += 1;
            }
        }
        // populate cumulative and fraction
        for (
                int i = 1;
                i < birthdays.length; i++) {
            cumulative[i] = cumulative[i - 1] + count[i];
        }
        for (
                int i = 0;
                i < birthdays.length; i++) {
            fraction[i] = (double) cumulative[i] / trials;
        }
        // print persons and count
        System.out.printf("%-6d %-8d %-12.1f%n", 1, count[0], fraction[0]);
        boolean stopprint = false;
        while (!stopprint) {
            for (int p = 1; p < birthdays.length; p++) {
                if (fraction[p - 1] < 0.5) {
                    System.out.printf("%-6d %-8d %-12f%n", p + 1, count[p], fraction[p]);
                }
                else {
                    stopprint = true;
                }
            }
        }
    }
}
