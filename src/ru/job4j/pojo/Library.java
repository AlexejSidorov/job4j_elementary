package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = makeNewBook("Red", 100);
        books[1] = makeNewBook("Green Book", 800);
        books[2] = makeNewBook("How to create buildings", 200);
        books[3] = makeNewBook("Clean code", 700);
        System.out.println("Before exchange");
        for (Book book : books) {
            System.out.println("Book name is " + book.getBookName()
                    + ", quantity pages is " + book.getPages());
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        System.out.println(System.lineSeparator() + "After exchange");
        for (Book book : books) {
            System.out.println("Book name is " + book.getBookName()
                    + ", quantity pages is " + book.getPages());
        }
        System.out.println(System.lineSeparator() + "Only Clean code");
        for (Book book : books) {
            if (book.getBookName().equals("Clean code")) {
                System.out.println("Book name is " + book.getBookName()
                        + ", quantity pages is " + book.getPages());
            }
        }
    }

    public static Book makeNewBook(String nameBook, int pages) {
        Book book = new Book();
        book.setBookName(nameBook);
        book.setPages(pages);
        return book;
    }
}
