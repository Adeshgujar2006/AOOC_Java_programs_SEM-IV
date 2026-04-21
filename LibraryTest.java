
package LibraryManagement;

class Book {
    private String title, author, ISBN;

    public Book(String title, String author, String ISBN) {
        this.title  = title;
        this.author = author;
        this.ISBN   = ISBN;
    }

    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public String getISBN()   { return ISBN; }

    public void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + ISBN);
    }
}

class Member {
    private int memberId;
    private String name, email;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name     = name;
        this.email    = email;
    }

    public int    getMemberId() { return memberId; }
    public String getName()     { return name; }
    public String getEmail()    { return email; }

    public void displayMember() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
        System.out.println("Email     : " + email);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "ISBN-001");
        Book b2 = new Book("Data Structures",  "Robert Lafore",  "ISBN-002");

        Member m1 = new Member(1, "Adesh", "adesh@email.com");

        System.out.println("===== Book Details =====");
        b1.displayBook();
        System.out.println();
        b2.displayBook();

        System.out.println("\n===== Member Details =====");
        m1.displayMember();

        System.out.println("\n" + m1.getName() + " borrowed: " + b1.getTitle());
    }
}
