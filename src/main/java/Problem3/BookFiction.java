package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        System.out.println(super.title);
        System.out.println(super.author);
        System.out.println(this.genres);
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword

    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees( int numOfDaysPastDue) {
        this.lateFeePerDayInDollar = lateFeePerDayInDollar;
        return lateFeePerDayInDollar * numOfDaysPastDue;
        // homework
    }
}
