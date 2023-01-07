public class Library {
    public static void main(String[] args) {


        Book[] books = {
                new Book("Pan Tadeusz", "Adam Mickiewicz", "Nowa era", 2000),
                new Book("Pan Tadeusz", "Adam Mickiewicz", "Nowa era", 2000),
                new Book("Pan Tadeusz", "Adam Mickiewicz", "Nowa Era", 2002),


        };

        Book book1 = books[0];
        Book book2 = books[1];
        System.out.println("książka 1 " + book1);
        System.out.println("książka 2 " + book2);

        if (book1.equals(book2)) {
            System.out.println("to dwie identyczne książki");
        } else {
            System.out.println("to dwie różne książki");
        }
    }
}
