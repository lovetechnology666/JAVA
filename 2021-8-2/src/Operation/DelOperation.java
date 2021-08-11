package Operation;

import book.book;
import book.bookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:08
 */
public class DelOperation implements IOperation{
    public void delete(int pos,bookList bookList){
        int currentSizes=bookList.getUseSizes();
        for (int i = pos; i <currentSizes-1; i++) {
            book book=bookList.getBook(i+1);
            bookList.setBook(i,book);
        }
        //防止内存泄漏
        bookList.setBook(currentSizes-1,null);
        //控制UseSizes
        bookList.setUseSizes(currentSizes-1);
    }
    @Override
    public void work(bookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除图书！");
        System.out.println("请输入书名：");
        String name=scanner.nextLine();
        for (int i = 0; i < bookList.getUseSizes(); i++) {
            book book=bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到此书如下：");
                System.out.println(book);
                delete(i,bookList);
                System.out.println("已删除！！");
                return;
            }
        }
        System.out.println("没找到此书籍！！");
    }
}
