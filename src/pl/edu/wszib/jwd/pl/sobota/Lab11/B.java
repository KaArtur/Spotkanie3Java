package pl.edu.wszib.jwd.pl.sobota.Lab11;

public class B extends A {
    public B() {
        System.out.println("Konstruktor B()");
    }

    public B(boolean isSilent) {
        super(true );
        if (!isSilent) {
            System.out.println("Konstruktor B(" + isSilent + ") ");
        }
    }
}