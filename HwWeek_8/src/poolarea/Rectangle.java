package poolarea;
public class Rectangle {
    double width;//here width is a variable
    double length;//here length is a variable
    Rectangle(double width, double length){//constructor with 2 para
        this.width = width;
        this.length = length;
        if (this.width < 0) {
            width = 0;
        }
        if (this.length < 0) {
            length = 0;
        }
    }
    public double getWidth(){//udm return type with no para
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return this.width * this.length;
    }

}
