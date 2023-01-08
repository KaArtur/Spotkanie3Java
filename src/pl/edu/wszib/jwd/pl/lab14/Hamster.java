package pl.edu.wszib.jwd.pl.lab14;

public class Hamster extends Animal {

    private static String type = "Chomik" ;
    private static int counter = 0;

    public Hamster() {
        counter++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }
}
