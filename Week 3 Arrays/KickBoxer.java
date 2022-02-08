/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class KickBoxer {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        int[] weights = { 112, 115, 118, 122, 126, 130, 135, 140, 147, 154 };
        String[] CLASS = {
                "Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight",
                "Feather Weight", "Super Feather Weight", "Light Weight", "Super Light Weight",
                "Welter Weight", "Super Welter Weight"
        };
        for (int i = 0; i < weights.length; i++) {
            if (weight < weights[i]) {
                System.out.println(CLASS[i]);
                break;
            }
        }
    }
}
