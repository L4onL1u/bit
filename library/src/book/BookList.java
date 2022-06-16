package book;

import java.util.Arrays;

public class BookList {

    private Book[] bookList = new Book[20];

    private int usedSize;

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public BookList() {

    }
    public BookList(Book[] bookList) {
        this.bookList = bookList;
        this.usedSize = this.bookList.length;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public Book getBook(int pos) {
        return this.bookList[pos];
    }

    public void setBook(int pos, Book book) {
        this.bookList[pos] = book;
        this.usedSize++;
    }

    public void delBook(int i) {
        System.arraycopy(this.getBookList(), i + 1, this.getBookList(), i, this.getUsedSize() - i);
        this.usedSize--;
    }
}
