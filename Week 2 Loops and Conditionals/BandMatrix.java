/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int diagonal = 1; diagonal <= n; diagonal++) {
            for (int position = 1; position <= n; position++) {
                int a = position - diagonal;
                if (Math.abs(a) <= width) System.out.print("*  ");
                else System.out.print("0  ");
            }
            System.out.println(" ");
        }
    }
}
