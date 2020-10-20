package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
        System.out.println(super.title);
        System.out.println(super.author);
    }

    public BookRomance(BookRomance anotherBook) {

        // homework
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {

        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework

        return lateFeePerDayInDollar * numOfDaysPastDue;
    }
}
