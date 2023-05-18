package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of Interest: "+ s.getRateOfInterest());
        System.out.println("ICICI rate of Interest: "+ s.getRateOfInterest());
        System.out.println("AXIX rate of Interest: "+ s.getRateOfInterest());
    }
}
//  NOT GETTING CORRECT OUTPUT ..????