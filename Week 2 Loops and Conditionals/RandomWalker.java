/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int distance = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        while (distance != r) {
            int random = (int) (Math.random() * 4);
            if (random == 3) {
                x += 1;
            }
            else {
                if (random == 2) {
                    x -= 1;
                }
                else {
                    if (random == 1) {
                        y += 1;
                    }
                    else {
                        y -= 1;
                    }
                }
            }
            System.out.println("(" + x + ", " + y + ")");
            distance = Math.abs(x) + Math.abs(y);
            steps += 1;
        }
        System.out.println("steps = " + steps);
    }
}
