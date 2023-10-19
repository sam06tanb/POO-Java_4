package entities;
public class Retangle {

    public int area;
    public int perimeter;
    public int diagonal;

    public double width;

    public double height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * width + height;
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }




}
