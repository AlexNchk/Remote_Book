import java.time.LocalDate;

public class Author {
        public String name;
        public String surname;
        public int numberBook;
        public Author(String name, String surname){
            this.name = name;
            this.surname = surname;
            this.numberBook = 0;
        }
        public Book newBook(String title){
            Book book = new Book(title,this, LocalDate.now().getYear());
            return book;
        }
}
