/**
 * Created by vitz on 14.11.16.
 */
public class User implements IUser{

    private String name;

    public User(String name){this.name = name;}
    public User(){}
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
