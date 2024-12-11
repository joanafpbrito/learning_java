package Ex_03;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area (){
        double area = width*height;
        return area;
    }

    public double perimeter () {
        double perimeter = (width*2) + (height*2);
        return perimeter;
    }


}


