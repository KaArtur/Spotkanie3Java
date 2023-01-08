package pl.edu.wszib.jwd.pl.sobota;

public class Boy extends Human {

    public void eat() {
        System.out.println("Eat pl.edu.wszib.jwd.pl.sobota.Boy");
    }
    public static void main(String[] args) {
    Boy boy = new Boy();

        boy.eat();
        Human human = new Human();
        human.eat();
    }

}
