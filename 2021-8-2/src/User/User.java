package User;
import Operation.*;
import book.bookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 11:41
 */
public abstract class User {
    protected String name;
    protected IOperation[] ioperations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    public void doIOperation(int choice,bookList bookList){
        this.ioperations[choice].work(bookList);
    }
}
