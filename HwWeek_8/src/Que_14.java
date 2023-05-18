import java.util.Scanner;

public class Que_14 {
    /*
    Write a program in Java to display the pattern like a diamond.
     */
    public static void main(String[] args) {
        diamond();
    }

    public static void diamond() {
        int i, j, r;
        System.out.println("Input Number of Rows : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
