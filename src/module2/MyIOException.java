package module2;

public class MyIOException extends RuntimeException {
    public MyIOException() {
        super("Упс! при работе с файлом произошла ошибка (-_-)");
    }
}
