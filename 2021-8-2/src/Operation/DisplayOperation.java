package Operation;

import book.book;
import book.bookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:16
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(bookList bookList) {
        System.out.println("显示图书!");
        for (int i = 0; i < bookList.getUseSizes(); i++) {
            book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
