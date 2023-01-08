package pl.edu.wszib.jwd.pl.sobota.Lab11;

public class A {
    public A() {
        System.out.println("Konstruktor pl.edu.wszib.jwd.pl.sobota.A()");
    }

    public A(boolean isSilent) {
        super();
        if (!isSilent) {
            System.out.println("Konstruktor pl.edu.wszib.jwd.pl.sobota.A(" + isSilent + ") ");
        }

    }
}