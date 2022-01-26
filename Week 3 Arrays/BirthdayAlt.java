/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BirthdayAlt {
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
            for (int j = 1; j < birthdays.length; j++) {
                boolean breakbigloop = false;
                while (!breakbigloop) {
                    for (int k = 0; k < j; k++) {
                        boolean breakloop = false;
                        while (!breakloop) {
                            if (birthdays[k] == birthdays[j]) {
                                count[j] += 1;
                            }
                            breakloop = true;
                            breakbigloop = true;
                        }
                    }
                }
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
        System.out.println("1      0      0.0");
        boolean stopprint = false;
        while (!stopprint) {
            for (int p = 1; p < birthdays.length; p++) {
                if (fraction[p - 1] <= 0.5) {
                    System.out.print(p + 1 + "      " + count[p] + "      " + fraction[p]);
                    System.out.println();
                }
                else {
                    stopprint = true;
                }
            }
        }
    }
}
