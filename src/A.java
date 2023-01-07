public class A {

    void show() {
        System.out.println("A");
    }

}

class B extends A {

    void show() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();

    }

}
