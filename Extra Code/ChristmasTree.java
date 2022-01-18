/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ChristmasTree {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        String tree = "";
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            tree += "*";
            System.out.println(tree);
        }
        System.out.println(" ");
    }
}
