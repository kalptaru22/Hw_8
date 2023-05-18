import java.util.Scanner;

public class Que_6 {
    /*
    Write a program in Java to display the pattern like a triangle with a number.
    */
    public static void main(String[] args) {
        Que_6 q = new Que_6();
        q.numtri();
    }

    public void numtri() {
        System.out.println("Enter Number of Rows :  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, b;
        for (i = 1; i <= a; i++) {
            for (b = 1; b <= i; b++)
                System.out.print(i);
            System.out.println("");
        }

    }

}
