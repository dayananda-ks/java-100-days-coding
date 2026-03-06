package library_management;

import java.util.Scanner;

import java.util.ArrayList;

class Book {

    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
        System.out.println("-------------------------");
    }
}


class Member {

    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void displayMember() {
        System.out.println("Member ID: " + id);
        System.out.println("Name: " + name);
    }
}


class Transaction {

    private int bookId;
    private int memberId;
    private String type;

    public Transaction(int bookId, int memberId, String type) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.type = type;
    }

    public void displayTransaction() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Member ID: " + memberId);
        System.out.println("Transaction Type: " + type);
        System.out.println("-------------------------");
    }
}



class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Transaction> transactions = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully.");
    }

    public void showBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }

    public void issueBook(int bookId, int memberId) {

        for (Book b : books) {

            if (b.getId() == bookId && !b.isIssued()) {

                b.issueBook();

                Transaction t = new Transaction(bookId, memberId, "ISSUED");
                transactions.add(t);

                System.out.println("Book issued successfully.");
                return;
            }
        }

        System.out.println("Book not available.");
    }

    public void returnBook(int bookId, int memberId) {

        for (Book b : books) {

            if (b.getId() == bookId && b.isIssued()) {

                b.returnBook();

                Transaction t = new Transaction(bookId, memberId, "RETURNED");
                transactions.add(t);

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Invalid return.");
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.displayTransaction();
        }
    }
}




public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {

            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Show Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Show Transactions");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);

                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Member member = new Member(memberId, name);
                    library.addMember(member);

                    break;

                case 3:
                    library.showBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int issueMemberId = sc.nextInt();

                    library.issueBook(issueBookId, issueMemberId);

                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int returnMemberId = sc.nextInt();

                    library.returnBook(returnBookId, returnMemberId);

                    break;

                case 6:
                    library.showTransactions();
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
