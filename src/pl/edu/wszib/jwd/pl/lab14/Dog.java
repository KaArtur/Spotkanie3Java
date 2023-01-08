package pl.edu.wszib.jwd.pl.lab14;

public class Dog extends Animal {



    private static String type = "Dog" ;
    private static int counter = 0;


    public Dog() {
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
