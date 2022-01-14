package cursor_education_JB;

import java.util.Map;

public class DownloadLibrary {

    Map<Integer, Book> DownloadLibrary(Map<Integer, Book> basicLibrary) {
        Book book1 = new Book(1, "Clean Code: A Handbook of Agile Software Craftsmznship", "Robert C. Martin", 2010);
        Book book2 = new Book(2, "Effective Java Programming Language Guide", "Joshua Bloch", 2014);
        Book book3 = new Book(3, "Dreamweaver MX 2004 Bible", "Joseph W.Lowery", 2004);
        Book book4 = new Book(4, "Agile Java Development with Spring, Hibernate and Eclipse", "Anil Hemrajani", 2006);
        Book book5 = new Book(5, "Hibernate: A Developer's Notebook", "James Elliott", 2004);
        Book book6 = new Book(6, "Web Development withJavaServer Pages", "DUANE K. FIELDS, MARK A. KOLB", 2014);
        Book book7 = new Book(7, "Sams Teach Yourself J2EE in 21 Days", "Martin Bond, Dan Haywood, Debbie Law, Andy Longshaw, Peter Roxburgh", 2014);

        basicLibrary.put(11111, book1);
        basicLibrary.put(22222, book2);
        basicLibrary.put(33333, book3);
        basicLibrary.put(44444, book4);
        basicLibrary.put(55555, book5);
        basicLibrary.put(66666, book6);
        basicLibrary.put(77777, book7);
        return basicLibrary;
    }
}

