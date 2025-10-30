package module3.builder;

public class Book {

    private final String title;
    private final String author;
    private final String isbn;
    private final String publisher;
    private final int publicationYear;
    private final int pageCount;
    private final String genre;
    private final String language;
    private final double price;
    private final boolean isAvailable;

    //Всё ниже написанное можно заменить с ломбок с аннотацией @Builder
    private Book(String title, String author, String isbn, String publisher, int publicationYear, int pageCount, String genre, String language, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
        this.genre = genre;
        this.language = language;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", pageCount=" + pageCount +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String isbn;
        private String publisher;
        private int publicationYear;
        private int pageCount;
        private String genre;
        private String language;
        private double price;
        private boolean isAvailable;

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder pageCount(int pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder language(String language) {
            this.language = language;
            return this;
        }

        public BookBuilder price(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder isAvailable(boolean isAvailabl) {
            this.isAvailable = isAvailabl;
            return this;
        }

        public Book builder() {
            return new Book(title, author, isbn, publisher, publicationYear, pageCount, genre, language, price, isAvailable);
        }

    }
}
