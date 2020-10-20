package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating = rating;
        this.title = title;

        // homework
    }

    public Movie(Movie anotherMovie) {
        // homework
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (!(obj instanceof Movie)) {
            return false;
        }

        Movie otherAnimal = (Movie) obj;
        return this.rating.equals(otherAnimal.rating) &&
                this.title.equals(otherAnimal.title) &&
                this.id == otherAnimal.id;
    }
}
