package Lab11;

public class A {
    public A() {
        System.out.println("Konstruktor A()");
    }

    public A(boolean isSilent) {
        super();
        if (!isSilent) {
            System.out.println("Konstruktor A(" + isSilent + ") ");
        }

    }
}