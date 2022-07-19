public class Main {
    public static void main(String[] args) {
        Author author = new Author("Роберт", "Стивенсон");
        Book book = new Book("Остров Сокровищ", author,1883);
        book.up();
        book.append("Йо-хо-хо, и бутылка рому!");
        System.out.println(author.name +" "+ author.surname);
        System.out.println("Рейтинг: " + book.rating + " | " + book.title + "  " + book.releas + " " + book.text);

        Author author2 = new Author("Жюль", "Верн");
        Book book2 = new Book("Таинственный остров", author2,1875);
        book2.down();
        book2.append("Необходимость - лучший учитель!");
        System.out.println(author2.name +" "+ author2.surname);
        System.out.println("Рейтинг: " + book2.rating + " | " + book2.title + "  " + book2.releas + " " + book2.text);

        Author author3 = new Author("Люси", "Фоли");
        Book book3 = author3.newBook("Список гостей");
        book3.up();
        book3.append("Увлекательной будет свадьба...");
        System.out.println(author3.name +" "+ author3.surname + " Написано книг: "+ author2.numberBook);
        System.out.println("Рейтинг: " + book3.rating + " | " + book3.title + "  " + book3.releas + " " + book3.text);
    }
}
