package cursor_education_JB;

public class Book {
    // Створив клас книга: інвентарний номер, назва книги, автор книги, рік випуску книги.
    int number;
    String author;
    String title;
    int publishYear;

    Book() {
        number = 1;
        author = "Robert C. Martin";
        title = "Clean Code: A Handbook of Agile Software Craftsmznship";
        publishYear = 2010;
    }

    Book(int bookNumber, String bookName, String bookAuthor, int year) {
        number = bookNumber;
        author = bookAuthor;
        title = bookName;
        publishYear = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "№ " + number +
                ", Author='" + author + '\'' +
                ", Title='" + title + '\'' +
                ", Publish year=" + publishYear +
                '}';
    }
}
