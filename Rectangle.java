package Session8;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.5, 4.5);
        Rectangle r2 = new Rectangle(3.5, 3.5);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println("Rectangle 1: " + "width=" + r1.getWidth() + ", " + "height=" + r1.getHeight() + ", " + "area=" + r1.getArea() + ", perimeter=" + r1.getPerimeter());
        System.out.println("Rectangle 2: " + "width=" + r2.getWidth() + ", " + "height=" + r2.getHeight() + ", " + "area=" + r2.getArea() + ", perimeter=" + r2.getPerimeter());
        System.out.println("Rectangle 3: " + "width=" + r3.getWidth() + ", " + "height=" + r3.getHeight() + ", " + "area=" + r3.getArea() + ", perimeter=" + r3.getPerimeter());
        int index = 1;
        Rectangle max = r1;
        if (max.getArea() < r2.getArea()) {
            max = r2;
            index = 2;
        } else {
            max = r3;
            index = 3;
        }
        if (r2.getArea() == r1.getArea() || r2.getArea() == r3.getArea() || r3.getArea() == r1.getArea()) {
            System.out.println("Co nhieu hinh bang nhau");
        } else {

            System.out.println("Largest area = " + max.getArea() + " " + "(" + "Rectangle " + index + ": " + "width=" + max.getWidth() + ", height=" + max.getHeight() + ")");
        }
    }
}
