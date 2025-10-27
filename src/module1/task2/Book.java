package module1.task2;

public class Book {

    public Book(String title, int yearRelease, int pageCount) {
        this.title = title;
        this.yearRelease = yearRelease;
        this.pageCount = pageCount;
    }

    private String title;

    private int yearRelease;

    private int pageCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
