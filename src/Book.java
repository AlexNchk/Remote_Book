import java.io.StringBufferInputStream;

public class Book {
    public String title;
    public int releas;
    public int rating;
    public String text;


    public Book(String title, Author author, int releas) {
        this.title = title;
        this.releas = releas;
        this.rating = 3;
        this.text = " ";
        author.numberBook++;
    }

    public void up() {
        if (this.rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (this.rating > 0) {
            rating--;
        }
    }

    public String append(String moreText) {
        text += moreText;
        return text;
    }

}

