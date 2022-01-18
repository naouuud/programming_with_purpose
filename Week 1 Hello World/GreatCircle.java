/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        a = Math.toRadians(a);
        b = Math.toRadians(b);
        c = Math.toRadians(c);
        d = Math.toRadians(d);
        double e = (c - a) / 2.0;
        e = Math.sin(e);
        e = e * e;
        double f = (d - b) / 2.0;
        f = Math.sin(f);
        f = f * f;
        f = Math.cos(a) * Math.cos(c) * f;
        double g = e + f;
        g = Math.sqrt(g);
        g = Math.asin(g);
        g = 2.0 * 6371.0 * g;
        System.out.println(g + " kilometers");
    }
}
