import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by William on 2015/10/8.
 */
public class Ex_1_1_5 {

    public static void main(String[] args) {
        double x;
        double y;
        x = StdIn.readDouble();
        y = StdIn.readDouble();
        StdOut.print(compare(x) && compare(y));
    }

    public static boolean compare(double x) {
        if (x > 0 && x < 1) {
            return true;

        } else {
            return false;
        }
    }
}
