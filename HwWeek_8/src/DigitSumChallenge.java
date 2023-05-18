public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(223);

    }

    public static void sumDigits(int number){
       // if(number>=10){
            while(number>0){
            int x,sum=0;
            x=number%10;
            sum = sum+x;
            number=number/10;
            }
        System.out.println();

        //}else {
          //  System.out.println("Invalid Value");
        //}

    }
}
