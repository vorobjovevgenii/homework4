//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Аня"
                ,"Вова");

        Reader reader1 = new Reader("Воробьев Е.Ф.",1,"Программирование","24-02-1985","314-66-90");

        reader1.printStatus();
        reader1.takeBook(book1);
        reader1.printStatus();

    }
}