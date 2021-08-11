package Operation;

import book.bookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:18
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}
