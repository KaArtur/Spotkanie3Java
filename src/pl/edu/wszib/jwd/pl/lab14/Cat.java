package pl.edu.wszib.jwd.pl.lab14;

public class Cat extends Animal {
    private static String type = "Kot" ;
    private static int counter = 0;

    public Cat() {
        counter++;
    }

    @Override
    public String getType() {
        return type ;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }
}
