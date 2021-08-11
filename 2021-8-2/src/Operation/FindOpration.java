package Operation;

import book.book;
import book.bookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:09
 */
public class FindOpration implements IOperation {
    @Override
    public void work(bookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书！");
        System.out.println("请输入书名：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUseSizes(); i++) {
            book book=bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到此书如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有找到此书！！");
    }
}
