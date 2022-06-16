package operation.impl;

import book.Book;
import book.BookList;
import operation.IOperation;

import java.util.Scanner;

public class AddBookImpl implements IOperation {

    Scanner scanner = new Scanner(System.in);
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入图书的名字：");
        String name = scanner.next();
        //不允许重名的图书
        if (bookList.getUsedSize() != 0) {
            for (Book book : bookList.getBookList()) {
                if (name.equals(book.getName())) {
                    System.out.println("此图书已存在！");
                    return;
                }
            }
        }
        System.out.println("请输入图书的作者：");
        String author = scanner.next();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();
        System.out.println("请输入图书的价格：");
        float price = scanner.nextFloat();
        Book book = new Book(name, author, price, type, false);
        bookList.setBook(bookList.getUsedSize(),book);
        System.out.println("新增图书成功！");
    }
}
