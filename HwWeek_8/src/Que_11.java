public class Que_11 {
    /*
    Even Digit Sum
    Write a method named getEvenDigitSum with one parameter of type int called number.
    The method should return the sum of the even digits within the number.
    If the number is negative,the method should return -1 to indicate an invalid value.
     */
    public static void main(String[] args) {
        System.out.println("Sum of Even Numbers is : " + getEvenDigitSum(-10));

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0, x;
        while (number != 0) {
            System.out.println("invalid input");
            x = number % 10;

            if (x % 2 == 0)
                sum = sum + x;
            number = number / 10;

        }
        return sum;
    }
}
