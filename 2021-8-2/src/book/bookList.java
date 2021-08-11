package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 强仔
 * Date: 2021-08-10
 * Time: 11:23
 */
public class bookList {
    private book[] books=new book[10];
    private int useSizes;
    public bookList(){
        books[0]=new book("三国演义","罗贯中",15,"小说");
        books[1]=new book("水浒传","施耐庵",16,"小说");
        books[2]=new book("西游记","吴承恩",17,"小说");
        this.useSizes=3;
    }
    public void setBook(int pos,book book){
        this.books[pos]=book;
    }
    public book getBook(int pos){
        return this.books[pos];
    }

    public int getUseSizes() {
        return useSizes;
    }

    public void setUseSizes(int useSizes) {
        this.useSizes = useSizes;
    }
}
