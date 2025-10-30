package module3.builder;

public class Main {
    public static void main(String[] args) {

        Book book = new Book.BookBuilder()
                .title("Книга")
                .pageCount(100)
                .price(2000)
                .language("Русский")
                .author("Автор")
                .publicationYear(2025)
                .isAvailable(false)
                .builder();

        System.out.println(book.toString());

        //Book{title='Книга', author='Автор', isbn='null', publisher='null', publicationYear=2025, pageCount=100, genre='null', language='Русский', price=2000.0, isAvailable=false}

    }
}
