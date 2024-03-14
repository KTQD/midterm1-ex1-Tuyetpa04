public class Main {
    public static void main(String[] args){
    MP3 mp3 = new MP3("Song Title", "MP3 Description", "MP3001", 9.99f, 180);
    Book book = new Book("Book Title", "Book Description", "BK001", 19.99f, "Author Name", 300, "Fiction");

        System.out.println("Information about MP3:");
        mp3.showInfo();

        System.out.println("\nInformation about Book:");
        book.showInfo();
    }
}
