package Operation;

import book.book;
import book.bookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:05
 */
public class AddOperation implements IOperation{
    @Override
    public void work(bookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("新增图书");
        String name=scanner.nextLine();
        int currentSizes=bookList.getUseSizes();
        for (int i = 0; i < currentSizes; i++) {
            book book=bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("此书已存在，无法重复添加");
                return;
            }
        }
        System.out.println("请输入作者：");
        String author=scanner.nextLine();
        System.out.println("请输入类型：");
        String type=scanner.nextLine();
        System.out.println("请输入价格：");
        int price=scanner.nextInt();
        book book=new book(name,author,price, type);
        bookList.setBook(currentSizes,book);
        bookList.setUseSizes(currentSizes+1);
        System.out.println("新增成功");
    }
}
