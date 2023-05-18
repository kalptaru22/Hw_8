import java.util.Scanner;

public class Que_1 {
    /*
    Read 10 numbers from the console entered by the user and print the sum of those
    numbers.
    */
    public static void main(String[] args) {
        add();
    }
    public static void add() {
        int sum = 0;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        while(counter<=10){
            System.out.println("Enter number #" + counter + ":");
            int num = sc.nextInt();
            sum = sum+num;
            counter++;
        }
        System.out.println("The sum of entered 10 Numbers is : "+sum);
    }
}
