package operation.impl;

import book.BookList;
import operation.IOperation;

public class ExitSystemImpl implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
    }
}
