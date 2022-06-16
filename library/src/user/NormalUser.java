package user;

import operation.IOperation;
import operation.impl.*;

public class NormalUser extends User {

    String[] menu = new String[]{"1.查找图书", "2.借阅图书", "3.归还图书", "0.退出系统"};

    public NormalUser(String userName) {
        super(userName);
        this.iOperations = new IOperation[]{
                new ExitSystemImpl(),
                new FindBookImpl(),
                new BorrowBookImpl(),
                new ReturnBookImpl()
        };
    }

    @Override
    public String[] menu() {
        return this.menu;
    }
}
