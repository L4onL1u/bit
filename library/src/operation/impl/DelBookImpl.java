package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

import java.util.Arrays;
import java.util.Scanner;

public class DelBookImpl implements IOperation {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void work(BookList bookList) {
        if (bookList.getUsedSize() == 0) {
            System.out.println("书库为空！");
            return;
        }
        System.out.println("删除图书！");
        System.out.println("请你输入你要删除图书的名字：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if (name.equals(bookList.getBook(i).getName())) {
                bookList.delBook(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("删除失败！");
    }
}
