package project;
import java.util.ArrayList;
public class User
{
    private String userName;
    private String password;
    private String email;
    private bookList myBookList;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        myBookList = new bookList();
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public void addBookList(Book book){
        myBookList.add(book);
    }

    public void deleBookList(Book book){
        myBookList.delete(book);
    }

    public String getName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public ArrayList<Book> getBookList(){
        return myBookList.init();
    }
}