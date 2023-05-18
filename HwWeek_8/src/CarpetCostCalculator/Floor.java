package CarpetCostCalculator;

public class Floor {
    public double width;// variable width
    public double length;// variable length

    public void Floor(double width, double length) {//constructor with two parameters
        if ((width < 0) && (length < 0)) {
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        } else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
        return;
    }

    public double getArea() {//udm with no parameters
        return this.width * this.length;
    }
}
