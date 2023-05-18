package CarpetCostCalculator;

public class Carpet {
    double cost ;
    public Carpet(double cost) {
        this.cost = cost;
        if (this.cost < 0) {
            cost = 0;
        }
    }
    public double getCost(){
        return cost;
    }
}
