package CarpetCostCalculator;

public class Calculator {
    public Floor floor ;// instance variable
    public Carpet carpet ;// instance variable

    public Calculator(Floor floor, Carpet carpet) {//constructor with 2 para
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalcost() {//udm
        return floor.getArea() * carpet.getCost();
    }
}
