class Shape
{
    int length;
    int breadth;
}
class Rectangle extends Shape {
    int area;

    public void calculateArea() {
        area = length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 20;
        r.calculateArea();
        System.out.println("The Area of rectangle of length \"" + r.length + "\" and breadth \"" + r.breadth + "\" is \"" + r.area + "\"");
    }
}
