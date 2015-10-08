import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by William on 2015/10/8.
 */
public class Ex_1_1_11 {

    public Ex_1_1_11() {

    }

    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];

        a = RandomInitial(a);
        TestPrint(a);
    }

    private static void TestPrint(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + i);
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                if (a[i][j]) System.out.print("*" + " ");
                else System.out.print("_" + " ");

            }
            System.out.println(" ");
        }
    }

    private static boolean[][] RandomInitial(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (StdRandom.bernoulli(0.1)) a[i][j] = true;
                else a[i][j] = false;

            }
        }
        return a;
    }


}
