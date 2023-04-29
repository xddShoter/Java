package project;
import java.util.ArrayList;
public class Enter
{
    private static ArrayList<User> userList = new ArrayList<User>();

    public static boolean Register(String userName, String password){
        for(int i = 0;i < userList.size();i++){
			if(userName.equals(userList.get(i).getName()))
                return false;
		}
        User user = new User(userName, password);
        userList.add(user);
        return true;
    }

    public static boolean Login(String userName, String password){
        for(int i = 0;i < userList.size();i++){
			if(userName.equals(userList.get(i).getName()) && password.equals(userList.get(i).getPassword()))
                return true;   
		}
        return false;
    }
}