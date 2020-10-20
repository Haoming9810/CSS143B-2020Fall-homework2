package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;


    public Book() {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public String Book(Book anotherBook) {
        return "the book title is" + title + "the author is" + author + "the Id is " + id + ".";


        // homework
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }

        Book otherAnimal = (Book) obj;
        return this.title.equals(otherAnimal.title) &&
                this.author.equals(otherAnimal.author) &&
                this.id == otherAnimal.id;
    }
}
