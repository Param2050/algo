package practice.java;

import java.util.Objects;

public class NewPerson {

    String title;
    String author;

    public NewPerson(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewPerson newPerson = (NewPerson) o;
        return Objects.equals(title, newPerson.title) &&
                Objects.equals(author, newPerson.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
