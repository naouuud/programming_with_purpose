/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] count = new int[10 * n];
        for (int i = 0; i < trials; i++) {
            int[] birthday = new int[n];
            int thiscount = 0;
            boolean stop = false;
            while (!stop) {
                int r = (int) (Math.random() * n); // pick random number between 0 and n-1
                birthday[r]++; // increment that birthday
                thiscount++; // increment number of people in room
                if (birthday[r] == 2) { // if there is a duplicate birthday
                    stop = true; // end trial
                    count[thiscount]++; // increment index of array count
                }
            }
        }
        int[] cumulative = new int[count.length];
        for (int i = 1; i < count.length; i++) {
            cumulative[i] = cumulative[i - 1] + count[i];
        }
        double[] fraction = new double[count.length];
        for (int i = 0; i < count.length; i++) {
            fraction[i] = (double) cumulative[i] / trials;
        }
        boolean stop = false;
        for (int i = 1; !stop; i++) {
            System.out.printf("%-6d %-8d %-12f%n", i, count[i], fraction[i]);
            if (fraction[i] >= 0.5) {
                stop = true;
            }
        }
    }
}