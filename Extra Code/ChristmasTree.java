/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
// Create a Christmas tree of height n (n <= 20)
public class ChristmasTree {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] tree = new String[n];
        tree[0] = "*";
        for (int i = 1; i < n; i++) {
            tree[i] = tree[i - 1] + "*";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%20s%-20s%n", tree[i], tree[i]);
        }
    }
}
