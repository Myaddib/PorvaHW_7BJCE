package cursor_education_JB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookLlibrary {

    public static void main(String[] args) {
        // write your code here


        // Створив книги: інвентарний номер, назва книги, автор книги, рік випуску книги.
        Book book1 = new Book(1, "Clean Code: A Handbook of Agile Software Craftsmznship", "Robert C. Martin", 2010);
        Book book2 = new Book(2, "Effective Java Programming Language Guide", "Joshua Bloch", 2014);
        Book book3 = new Book(3, "Dreamweaver MX 2004 Bible", "Joseph W.Lowery", 2004);
        Book book4 = new Book(4, "Agile Java Development with Spring, Hibernate and Eclipse", "Anil Hemrajani", 2006);
        Book book5 = new Book(5, "Hibernate: A Developer's Notebook", "James Elliott", 2004);
        Book book6 = new Book(6, "Web Development withJavaServer Pages", "DUANE K. FIELDS, MARK A. KOLB", 2014);
        Book book7 = new Book(7, "Sams Teach Yourself J2EE in 21 Days", "Martin Bond, Dan Haywood, Debbie Law, Andy Longshaw, Peter Roxburgh", 2014);

        // Заніс книги в бібліотечну базу.
        Map<Integer, Book> basicLibrary = new HashMap<>();
        basicLibrary.put(11111, book1);
        basicLibrary.put(22222, book2);
        basicLibrary.put(33333, book3);
        basicLibrary.put(44444, book4);
        basicLibrary.put(55555, book5);
        basicLibrary.put(66666, book6);
        basicLibrary.put(77777, book7);

        // Створив читача бібліотеки: читацький номер, прізвище, ім’я, вік читача.
        LibraryReader libraryReader1 = new LibraryReader(1, "Ivanov Ivan", 30);
        LibraryReader libraryReader2 = new LibraryReader(2, "Petrov Vasil", 23);
        LibraryReader libraryReader3 = new LibraryReader(3, "Macron Oleg", 23);

        // Створив базу читачыв бібліотеки: номер, читач.
        Map<Integer, LibraryReader> basicLibraryReader = new HashMap<>();
        basicLibraryReader.put(1, libraryReader1);
        basicLibraryReader.put(2, libraryReader2);
        basicLibraryReader.put(3, libraryReader3);

        // Створив список книг.
        ArrayList<Book> cardBooks1 = new ArrayList<>();
        cardBooks1.add(book1);
        cardBooks1.add(book4);
        cardBooks1.add(book5);

        ArrayList<Book> cardBooks2 = new ArrayList<>();
        cardBooks2.add(book2);
        cardBooks2.add(book6);
        cardBooks2.add(book7);

        ArrayList<Book> cardBooks3 = new ArrayList<>();
        cardBooks3.add(book3);

        //Картка читача який взяв книги.
        Map<LibraryReader, ArrayList<Book>> cardIndex1 = new HashMap<>();
        cardIndex1.put(libraryReader1, cardBooks1);

        Map<LibraryReader, ArrayList<Book>> cardIndex2 = new HashMap<>();
        cardIndex2.put(libraryReader2, cardBooks2);

        Map<LibraryReader, ArrayList<Book>> cardIndex3 = new HashMap<>();
        cardIndex3.put(libraryReader3, cardBooks3);

        //Список карток читачів і книги які вони взяли.
        ArrayList<Map> basicCardIndex1 = new ArrayList<>();
        basicCardIndex1.add(cardIndex1);
        basicCardIndex1.add(cardIndex3);
        basicCardIndex1.add(cardIndex2);
        ArrayList<Map> basicCardIndex2 = new ArrayList<>();
        basicCardIndex2.add(cardIndex2);
        ArrayList<Map> basicCardIndex3 = new ArrayList<>();
        basicCardIndex3.add(cardIndex3);

        //Картка бібліотеки по книгам які були виданні читачам.
        Map<LocalDate, ArrayList> cardIndexLibrary = new HashMap<>();
        cardIndexLibrary.put(LocalDate.of(2021, 12, 01), basicCardIndex1);
        cardIndexLibrary.put(LocalDate.of(2021, 12, 10), basicCardIndex2);
        cardIndexLibrary.put(LocalDate.of(2021, 12, 14), basicCardIndex3);

        //Пошук виданих книг за вказаний день.
        LocalDate searchDate = LocalDate.of(2012, 12, 01);
        System.out.println(searchDate + " : ");
        if (cardIndexLibrary.containsKey(searchDate)) {
            ArrayList<Map> searchBook1 = cardIndexLibrary.get(searchDate);
            for (int i = 0; i < searchBook1.size(); i++) {
                Map<LibraryReader, ArrayList<Book>> searchСardIndex = new HashMap<>();
                searchСardIndex = searchBook1.get(i);
                for (Map.Entry<LibraryReader, ArrayList<Book>> entry : searchСardIndex.entrySet()) {
                    ArrayList<Book> searchCardBooks;
                    searchCardBooks = entry.getValue();
                    for (int j = 0; j < searchCardBooks.size(); j++) {
                        System.out.println(searchCardBooks.get(j));
                    }
                }
            }
        } else {
            System.out.println("There are no books for this date");
        }

        //Виведення книг взятих в певний період  часу
        LocalDate searchDate1 = LocalDate.of(2021, 12, 01);
        LocalDate searchDate2 = LocalDate.of(2021, 12, 31);
        System.out.println(searchDate1 + " - " + searchDate2);


        searchDate2 = searchDate2.plusDays(1);
        int countBook = 0;
        while (!searchDate2.equals(searchDate1)) {
            System.out.print(searchDate1 + " : ");
            if (cardIndexLibrary.containsKey(searchDate1)) {
                ArrayList<Map> searchBook1 = cardIndexLibrary.get(searchDate1);
                for (int i = 0; i < searchBook1.size(); i++) {
                    Map<LibraryReader, ArrayList<Book>> searchСardIndex = new HashMap<>();
                    searchСardIndex = searchBook1.get(i);
                    for (Map.Entry<LibraryReader, ArrayList<Book>> entry : searchСardIndex.entrySet()) {
                        ArrayList<Book> searchCardBooks;
                        searchCardBooks = entry.getValue();
                        for (int j = 0; j < searchCardBooks.size(); j++) {
                            countBook++;
                        }
                    }
                }
                System.out.println(" "+countBook);
                countBook = 0;
            } else {
                System.out.println(" 0 ");

            }
            searchDate1 = searchDate1.plusDays(1);
        }


    }
}



