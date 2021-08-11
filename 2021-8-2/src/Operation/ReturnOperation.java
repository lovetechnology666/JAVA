package Operation;

import book.book;
import book.bookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:17
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(bookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("归还图书！");
        System.out.println("请输入归还图书的名字：");
        String name = scanner.nextLine();
        int currentSizes = bookList.getUseSizes();
        for (int i = 0; i < currentSizes; i++) {
            book book = bookList.getBook(i);
            if (book.getName().equals(name) && book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("没有找到此书或已经归还");
    }
}
