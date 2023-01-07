public class Boy extends Human {

    public void eat() {
        System.out.println("Eat Boy");
    }
    public static void main(String[] args) {
    Boy boy = new Boy();

        boy.eat();
        Human human = new Human();
        human.eat();
    }

}
