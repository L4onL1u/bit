import book.BookList;
import operation.IOperation;
import user.User;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static User login() {
        System.out.println("请输入姓名：");
        String userName = scanner.next();
        System.out.println("请输入你的身份：1->管理员，0->普通用户");
        int choice = scanner.nextInt();
        return User.getUser(choice, userName);
    }

    public static IOperation doOperation(User user, int choice) {
        return user.iOperations[choice];
    }

    public static void main(String[] args) {
        User user = login();
        while (user == null) {
            System.out.println("登录错误，请重新登录！");
            user = login();
        }
        System.out.println("hello " + user.getUserName() + " 欢迎来到图书小练习");
        for (String message : user.menu()) {
            System.out.println(message);
        }
        BookList bookList = new BookList();
        int choice = -1;
        while (choice != 0) {
            System.out.println("请输入你的操作：");
            choice = scanner.nextInt();
            IOperation iOperation = doOperation(user, choice);
            iOperation.work(bookList);
        }
    }
}
