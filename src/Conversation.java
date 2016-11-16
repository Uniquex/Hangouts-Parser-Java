import java.util.ArrayList;

/**
 * Created by vitz on 15.11.16.
 */
public class Conversation implements IConversation {
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    String conversationID = "";

    @Override
    public User getUser(int pos) {
        return null;
    }

    @Override
    public ArrayList<User> getUsers() {
        return this.users;
    }

    @Override
    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    public void addMessage(Message msg){
        messages.add(msg);
    }
}