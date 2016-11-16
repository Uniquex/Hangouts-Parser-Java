/**
 * Created by vitz on 14.11.16.
 */
public class User implements IUser{

    private String name;
    private String userID;

    public User(String name, String userID){
        this.name = name;
        this.userID = userID;
    }
    public User(){}
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void setUserID(String id) {
        this.userID = id;
    }

    @Override
    public String getUserID() {
        return this.userID;
    }

}
