import java.util.ArrayList;

/**
 * Created by vitz on 14.11.16.
 */
public interface IConversation {

    User getUser(int pos);
    void addUser(User usr);
    ArrayList<User> getUsers();
    ArrayList<Message> getMessages();
    void addMessage(Message msg);
}
