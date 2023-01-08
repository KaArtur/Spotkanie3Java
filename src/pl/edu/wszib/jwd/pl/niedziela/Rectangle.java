package pl.edu.wszib.jwd.pl.niedziela;

public class Rectangle extends Shape {

    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght =lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        return lenght*width;
    }
}
