package OOP.Library;

public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("Naruto", "Masashi Kishimoto");
        Member member = new Member("Nikko", 69);
        book.borrow();
        book.returnBook();
        member.displayInfo();
    }

}
