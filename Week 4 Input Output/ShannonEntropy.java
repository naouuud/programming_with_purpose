public class ShannonEntropy {
    public static void main(String[] args) {
        // program takes integer argument m, StdIn values will be between 1 and m
        int m = Integer.parseInt(args[0]);
        // create array to store instances of every integer between 1 and m in StdIn
        int[] integerCount = new int[m + 1];
        // create variable to record total integers provided in StdIn
        int totalCount = 0;
        // accept integer values from StdIn until end
        while (!StdIn.isEmpty()) {
            // increment totalCount
            totalCount += 1;
            int n = StdIn.readInt();
            // increment array at index = StdIn integer
            integerCount[n] += 1;
        }
        // create array to store proportion of each integer from StdIn
        double[] integerProportion = new double[integerCount.length];
        // populate array integerProportion
        for (int i = 1; i < integerCount.length; i++) {
            integerProportion[i] = (double) integerCount[i] / totalCount;
        }
        // create array to store -proportion.log2.proportion
        double[] proportionLog = new double[integerCount.length];
        // populate array proportionLog
        for (int i = 1; i < integerCount.length; i++) {
            if (integerProportion[i] != 0) {
                double log2 = Math.log(integerProportion[i]) / Math.log(2.0);
                proportionLog[i] = -1 * integerProportion[i] * log2;
            }
        }
        // trace to check values
        // for (int i = 1; i < integerCount.length; i++) {
        // StdOut.printf("%-10d %-10d %-10f %-10f%n", i, integerCount[i],
        //              integerProportion[i], proportionLog[i]);
        //}
        // calculate Shannon Entropy
        double h = 0;
        for (int i = 1; i < integerCount.length; i++) {
            h += proportionLog[i];
        }
        // print result to StdOut
        StdOut.printf("%.4f%n", h);
    }
}
