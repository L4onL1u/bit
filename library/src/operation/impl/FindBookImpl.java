package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

import java.util.Scanner;

public class FindBookImpl implements IOperation {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void work(BookList bookList) {
        if (bookList.getUsedSize() == 0) {
            System.out.println("书库为空！");
            return;
        }
        System.out.println("查找图书！");
        System.out.println("请输入你要查找的图书名字：");
        String name = scanner.next();
        for (Book book: bookList.getBookList()) {
            if (name.equals(book.getName())) {
                System.out.println("找到这本书了，信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到此书，书库中不存在此书！");
    }
}
