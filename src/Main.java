import module1.task2.Book;
import module1.task2.Student;
import module2.MyFIleWriterAndReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//
//        List<Book> bookList1 = Arrays.asList(
//                new Book("Гордость и предубеждение", 1813, 432),
//                new Book("Франкенштейн", 1818, 280),
//                new Book("Отцы и дети", 1862, 256),
//                new Book("Война и мир", 1869, 1225),
//                new Book("На Западном фронте без перемен", 1929, 296),
//                new Book("1984", 1949, 328),
//                new Book("Убить пересмешника", 1960, 281)
//        );
//        List<Book> bookList2 = Arrays.asList(
//                new Book("Война и мир", 1869, 1225),
//                new Book("Преступление и наказание", 1866, 551),
//                new Book("Моби Дик", 1851, 635),
//                new Book("Анна Каренина", 1877, 864),
//                new Book("Гарри Поттер и философский камень", 1997, 320),
//                new Book("Игра престолов", 1996, 694),
//                new Book("Шерлок Холмс", 1887, 307)
//        );
//        List<Book> bookList3 = Arrays.asList(
//                new Book("Властелин Колец", 1954, 1178),
//                new Book("Портрет Дориана Грея", 1890, 254),
//                new Book("Лолита", 1955, 336),
//                new Book("Три товарища", 1936, 480),
//                new Book("1984", 1949, 328),
//                new Book("Убить пересмешника", 1960, 281),
//                new Book("Сто лет одиночества", 1967, 417)
//        );
//        List<Book> bookList4 = Arrays.asList(
//                new Book("Мастер и Маргарита", 1967, 480),
//                new Book("Атлант расправил плечи", 1957, 1168),
//                new Book("Парфюмер", 1985, 263),
//                new Book("Код да Винчи", 2003, 454),
//                new Book("Хоббит", 1937, 310),
//                new Book("Властелин Колец", 1954, 1178),
//                new Book("Портрет Дориана Грея", 1890, 254)
//        );
//        List<Book> bookList5 = Arrays.asList(
//                new Book("Моби Дик", 1851, 635),
//                new Book("Анна Каренина", 1877, 864),
//                new Book("Война и мир", 1869, 1225),
//                new Book("Преступление и наказание", 1866, 551),
//                new Book("Моби Дик", 1851, 635),
//                new Book("Анна Каренина", 1877, 864)
//
//        );
//        List<Book> bookList6 = Arrays.asList(
//                new Book("Парфюмер", 1985, 263),
//                new Book("Код да Винчи", 2003, 454),
//                new Book("Гарри Поттер и философский камень", 1997, 320),
//                new Book("Игра престолов", 1996, 694),
//                new Book("Властелин Колец", 1954, 1178),
//                new Book("Портрет Дориана Грея", 1890, 254),
//                new Book("Лолита", 1955, 336)
//
//        );
//        List<Book> bookList7 = Arrays.asList(
//                new Book("Франкенштейн", 1818, 280),
//                new Book("Отцы и дети", 1862, 256),
//                new Book("Война и мир", 1869, 1225),
//                new Book("Преступление и наказание", 1866, 551),
//                new Book("Моби Дик", 1851, 635)
//        );
//        List<Book> bookList8 = Arrays.asList(
//                new Book("Мастер и Маргарита", 1967, 480),
//                new Book("Атлант расправил плечи", 1957, 1168),
//                new Book("Парфюмер", 1985, 263),
//                new Book("Код да Винчи", 2003, 454),
//                new Book("Гарри Поттер и философский камень", 1997, 320),
//                new Book("Игра престолов", 1996, 694),
//                new Book("Шерлок Холмс", 1887, 307)
//        );
//        List<Book> bookList9 = Arrays.asList(
//                new Book("Улисс", 1922, 730),
//                new Book("Великий Гэтсби", 1925, 218),
//                new Book("На Западном фронте без перемен", 1929, 296),
//                new Book("1984", 1949, 328),
//                new Book("Убить пересмешника", 1960, 281),
//                new Book("Сто лет одиночества", 1967, 417)
//        );
//        List<Book> bookList10 = Arrays.asList(
//                new Book("Хоббит", 1937, 310),
//                new Book("Властелин Колец", 1954, 1178),
//                new Book("Портрет Дориана Грея", 1890, 254),
//                new Book("Лолита", 1955, 336),
//                new Book("Три товарища", 1936, 480)
//        );
//
//        Student student1 = new Student("Иванов Александр Сергеевич", 20, bookList1);
//        Student student2 = new Student("Петрова Мария Дмитриевна", 22, bookList2);
//        Student student3 = new Student("Сидоров Дмитрий Владимирович", 19, bookList3);
//        Student student4 = new Student("Козлова Анна Игоревна", 21, bookList4);
//        Student student5 = new Student("Николаев Артем Павлович", 23, bookList5);
//        Student student6 = new Student("Фролова Екатерина Олеговна", 20, bookList6);
//        Student student7 = new Student("Волков Максим Андреевич", 24, bookList7);
//        Student student8 = new Student("Смирнова Ольга Викторовна", 22, bookList8);
//        Student student9 = new Student("Лебедев Павел Николаевич", 25, bookList9);
//        Student student10 = new Student("Новикова Юлия Сергеевна", 19, bookList10);
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//        students.add(student6);
//        students.add(student7);
//        students.add(student8);
//        students.add(student9);
//        students.add(student10);
//
//        students.stream().
//                peek(student -> System.out.println(student.toString())).
//                map(student -> student.getBooks()).
//                flatMap(books -> {
//                    List<Book> allBooks = new ArrayList<>();
//                    for (Book book : books) {
//                        allBooks.add(book);
//                    }
//                    return allBooks.stream();
//                }).
//                sorted(Comparator.comparing(book -> book.getPageCount())).
//                distinct().
//                filter(book -> book.getYearRelease() > 2000).
//                limit(3).
//                map(book -> book.getYearRelease()).
//                findAny().ifPresentOrElse(integer -> System.out.println(integer), () -> System.out.println("Книга отсутсвует"));
        MyFIleWriterAndReader myFIleWriterAndReader = new MyFIleWriterAndReader();

        myFIleWriterAndReader.writeAndRead("");



    }
}