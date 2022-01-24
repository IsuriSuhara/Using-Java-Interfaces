package test1;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<User> users=new ArrayList<User>();
        User user1 = new User(2,"Isuri");
        User user2 = new User(1,"Pathum");

        users.add(user1);
        users.add(user2);

        Collections.sort(users);

        //User[] userArray = {user1,user2};
        //Arrays.sort(userArray);

        for(User user:users){
            System.out.println(user);
        }
    }
}
