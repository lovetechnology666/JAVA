package 比特图书管理;

import User.AdminUser;
import User.User;
import User.NormalUser;
import book.bookList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 12:49
 */
public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=scanner.nextLine();
        System.out.println("请确定身份--》 1-管理员 |  2-普通用户");
        int choice=scanner.nextInt();
        if(choice==1){
            return new AdminUser(name);
        }
        return new NormalUser(name);
    }
    public static void main(String[] args) {
        bookList bookList = new bookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doIOperation(choice, bookList);
        }
    }
}
