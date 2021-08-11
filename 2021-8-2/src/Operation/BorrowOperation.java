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
public class BorrowOperation implements IOperation{
    @Override
    public void work(bookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("借阅图书！");
        System.out.println("请输入借阅图书的名字：");
        String name=scanner.nextLine();
        int currentSizes=bookList.getUseSizes();
        for (int i = 0; i < currentSizes; i++) {
            book book=bookList.getBook(i);
            if (book.getName().equals(name)&&!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有找到此书或已经借出");
    }
}
