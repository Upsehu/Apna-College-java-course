import java.util.*;

public class Marks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int input, marks;

        do {
            System.out.println("Please enter 2 numbers either 1 or 0:");
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            System.out.println("Please Enter marks:");
            marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else {
                System.out.println("This is Good as well");
            }
        } while (true);
    }
}
