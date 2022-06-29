import java.util.*;

public class Pattern1 {
    public static void main(String args[]) {

        int n = 4;
        int m = 5;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
