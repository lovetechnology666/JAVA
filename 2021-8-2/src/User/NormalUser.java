package User;
import Operation.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 11:40
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioperations=new IOperation[]{
                new ExitOperation(),
                new FindOpration(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("=============普通用户菜单==================");
        System.out.println("hello "+this.name+" 欢迎来到比特图书管理系统");
        System.out.println("1 查找图书");
        System.out.println("2 借阅图书");
        System.out.println("3 归还图书");
        System.out.println("0 退出系统");
        System.out.println("=========================================");
        int choice=scanner.nextInt();
        return choice;
    }
}
