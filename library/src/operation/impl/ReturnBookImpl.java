package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

import java.util.Scanner;

public class ReturnBookImpl implements IOperation {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void work(BookList bookList) {
        if (bookList.getUsedSize() == 0) {
            System.out.println("书库为空！");
            return;
        }
        System.out.println("归还图书！");
        System.out.println("请输入你要归还的图书名字：");
        String name = scanner.next();
        for (Book book : bookList.getBookList()) {
            if (name.equals(book.getName()) && book.isBorrowing()) {
                book.setBorrowing(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("归还失败！");
    }
}
