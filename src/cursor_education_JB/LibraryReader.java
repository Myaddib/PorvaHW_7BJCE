package cursor_education_JB;

public class LibraryReader {
    // Створив клас читач бібліотеки: читацький номер, <прізвище, ім’я>, вік читача.
    int inn;
    String name;
    int age;

    LibraryReader(int innCon, String nameCon, int ageCon) {
        inn = innCon;
        name = nameCon;
        age = ageCon;
    }

    @Override
    public String toString() {
        return "Library reader{" +
                "Inn=" + inn +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                '}';
    }
}
