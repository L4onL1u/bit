package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

import java.util.Scanner;

//借阅图书
public class BorrowBookImpl implements IOperation {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void work(BookList bookList) {
        if (bookList.getUsedSize() == 0) {
            System.out.println("书库为空！");
            return;
        }
        System.out.println("借阅图书！");
        System.out.println("请输入你要借阅的图书名字：");
        String name = scanner.next();
        for (Book book:bookList.getBookList()) {
            if (name.equals(book.getName()) && !book.isBorrowing()) {
                book.setBorrowing(true);
                System.out.println("借阅成功！");
                break;
            }
        }
        System.out.println("借阅失败！");
    }
}
