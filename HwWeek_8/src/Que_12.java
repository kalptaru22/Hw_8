import java.util.Scanner;

public class Que_12 {
    /*
    Write a programme to input any number and check if it is prime or not.
     */

    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        System.out.println("Enter a Number to Check if it is a Prime Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean x = false;
        for (int i=2; i<=num/2; ++i){
            if (num % i == 0){
                x= true;
                break;
            }
        }
        if (!x) {
            System.out.println(num + " is a Prime Number ");
        }else
            System.out.println(num + " is not a Prime Nember ");
    }
}
