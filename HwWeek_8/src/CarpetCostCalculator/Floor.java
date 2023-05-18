package CarpetCostCalculator;

public class Floor {
    double width;// variable width
    double length;// variable length

    public void Floor(double width, double length) {//constructor with two parameters
        this.width = width;
        this.length = length;
        if (this.width < 0) {
            width = 0;
        }
        if (this.length < 0) {
            length = 0;
        }
        return;
    }
        public double getArea () {//udm with no parameters
            return this.width * this.length;
        }
}
