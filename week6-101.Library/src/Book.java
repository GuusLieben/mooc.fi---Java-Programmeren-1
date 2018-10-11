public class Book {
    private String tle;
    private String pub;
    private int releaseyear;

    public Book(String title, String publisher, int year) {
        this.tle = title;
        this.pub = publisher;
        this.releaseyear = year;
    }

    public String title() { return tle; }

    public String publisher() { return pub; }

    public int year() { return releaseyear; }

    @Override
    public String toString() {
        return title() + ", " + publisher() + ", " + year();
    }
}
