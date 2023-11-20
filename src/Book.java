/* DOĞANAY BALABAN 1220505057 */
public class Book {
    /* Tutulması gereken fieldlar */
    private Integer bookID;
    private String bookName;
    private String bookAuthor;
    private boolean isOdunc;

    /* Yapıcı metot */
    public Book(Integer bookID, String bookName, String bookAuthor) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.isOdunc = false;
    }

    /* Encapsulate işlemi */
    public Integer getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isOdunc() {
        return isOdunc;
    }

    public void setIsOdunc(boolean isOdunc) {
        this.isOdunc = isOdunc;
    }

}
