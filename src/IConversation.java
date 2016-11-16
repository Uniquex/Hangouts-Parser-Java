import java.util.ArrayList;

/**
 * Created by vitz on 14.11.16.
 */
public interface IConversation {

    User getUser(int pos);
    ArrayList<User> getUsers();
    ArrayList<Message> getMessages();
    Message addMessage();
}
