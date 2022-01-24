package test1;

public class User implements Comparable<User>{//class which needs sorting should implement comparable interface.
    int id;
    String name;
    public User(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return id +" : "+name;
    }
    @Override//implement  the compareTo method
   /* public int compareTo(User user) {
        return user.getId()-id;//descending order
        //return id-user.getId();//ascending order
    }
*/
    public int compareTo(User user){
        return name.compareTo(user.getName());//alphabetical order
    }
}

