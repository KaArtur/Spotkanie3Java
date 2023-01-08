package pl.edu.wszib.jwd.pl.sobota;

public class A {
    public A() {
        super();
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.pl.sobota.A()");
    }

    public A(String param) {
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.pl.sobota.A(" + param + ")");
    }

}

class B extends A {
    public B() {
        super();
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.pl.sobota.B()");
    }

    public B (String param) {
        super(param);
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.pl.sobota.B(" + param + ")");
    }

}

class Test {
    public static void main(String[] args) {
        B b = new B("test");
    }

}
