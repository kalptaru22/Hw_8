import java.util.Scanner;

public class Que_15 {
    /*
    Display left angle triangle of * using nested for loops
     */
    public static void main(String[] args) {
        triangle();
    }
    public static void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int row = sc.nextInt();
        for (int i =1;i<=row; i++){
            for (int x =1; x<=i; x++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
