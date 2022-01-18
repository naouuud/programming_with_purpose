/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalsteps = 0;
        for (int i = 0; i <= trials; i++) {
            int x = 0;
            int y = 0;
            int distance = 0;
            int steps = 0;
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
                distance = Math.abs(x) + Math.abs(y);
                steps += 1;
            }
            totalsteps = totalsteps + steps;
        }
        double averagesteps = (double) totalsteps / (double) trials;
        System.out.println("average number of steps = " + averagesteps);
    }
}
