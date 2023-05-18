public class FirstAndLast {
    /*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needsto find the first and the last digit of the parameter number passed to the method,
    using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needsto return -1 to indicate an invalid value.
     */


    public static void main(String[] args) {
    sumFirstAndLastDigit(124567);

    }
    public static int sumFirstAndLastDigit(int number) {//return type with one parameter
        int firstdig = 0;
        int lastdig = 0;
        lastdig = Math.abs(number % 10);// find last digit

        while (number != 0) { // Find first digit
            firstdig = Math.abs(number % 10);
            number /= 10;
        }
        System.out.println("The first digit of the number is : " + firstdig);
        System.out.println("The last digjit of the number is : " + lastdig);

        int sum = (firstdig + lastdig);
        System.out.println("Sum of First and last digits of the number is : " + sum);
        return sum;

    }

}