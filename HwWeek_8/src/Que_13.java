public class Que_13 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(110,8));//called static method directly and passed value to the parameters
    }

    public static boolean hasSharedDigit(int a, int b) {// return type with two parameters
        if ((a < 10 || a> 99) || (b <10 || b>99))
            return false;
        int x = a % 10;//finds last digit of number
        int y = b % 10;//finds last digit of number
        a /= 10;//finds first digit
        b /= 10;//finds first digit
        return (a == b || a == y || x == b || x == y);
    }
}
