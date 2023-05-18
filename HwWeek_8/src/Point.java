public class Point {//Write a class with the name Point.
    int x;// variable x
    int y;// variable y
    public Point() {//constructor with no parameters
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {//constructor with two parameters
        this.x = x;
        this.y = y;
    }

    public int getX() {// return type with no para
        return x;
    }

    public int getY() {// return type with no para
        return y;
    }

    public void setX(int x) {//return type with one parameter
        this.x = x;
    }

    public void setY(int y) {//return type with one parameter
        this.y = y;
    }

    public double distance() {// return type with no para
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int x, int y) {// return type with two parameters
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(Point xy){//return type with one parameter
        return Math.sqrt((this.x-xy.x) * (this.x-xy.x)+(this.y-xy.y)*(this.y-xy.y));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
