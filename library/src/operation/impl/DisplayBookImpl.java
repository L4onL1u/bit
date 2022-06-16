package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

public class DisplayBookImpl implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");
        if (bookList.getUsedSize() == 0) {
            System.out.println("书库为空！");
            return;
        }
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
