package CarpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor();// Error ..????
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalcost());
        carpet = new Carpet(1.5);
        floor = new Floor();//Error... ????
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalcost());
    }
}
