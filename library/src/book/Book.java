package book;

public class Book {

    //图书名字
    private String name;

    //图书作者
    private String author;

    //图书价格
    private float price;

    //图书类型
    private String type;

    //图书是否被借阅
    private boolean isBorrowing;

    public Book(String name, String author, float price, String type, boolean isBorrowing) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrowing = isBorrowing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowing=" + isBorrowing +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowing() {
        return isBorrowing;
    }

    public void setBorrowing(boolean borrowing) {
        isBorrowing = borrowing;
    }
}
