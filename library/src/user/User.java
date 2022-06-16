package user;

import operation.IOperation;

import java.util.function.Function;

public abstract class User {

    private String userName;

    public IOperation[] iOperations;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public static User getUser(int choice, String userName) {
        if (choice != 0 && choice != 1) {
            return null;
        }else if (choice == 1) {
            return new AdminUser(userName);
        }else {
            return new NormalUser(userName);
        }
    }

    public abstract String[] menu();
}
