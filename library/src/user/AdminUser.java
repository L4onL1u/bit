package user;

import operation.IOperation;
import operation.impl.*;

public class AdminUser extends User {

    String[] menu = new String[]{"1.查找图书", "2.新增图书", "3.删除图书", "4.显示图书", "0.退出系统"};

    public AdminUser(String userName) {
        super(userName);
        this.iOperations = new IOperation[] {
                new ExitSystemImpl(),
                new FindBookImpl(),
                new AddBookImpl(),
                new DelBookImpl(),
                new DisplayBookImpl()
        };
    }

    @Override
    public String[] menu() {
        return this.menu;
    }
}
