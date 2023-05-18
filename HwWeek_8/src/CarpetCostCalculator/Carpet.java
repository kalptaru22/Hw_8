package CarpetCostCalculator;

public class Carpet extends Floor{
    double cost ;//variable
    public Carpet(double cost) {//return type with one para
        this.cost = cost;
        if (this.cost < 0) {
            cost = 0;
        }
    }
    public double getCost(){//udm return type no para
        return cost;
    }
}
