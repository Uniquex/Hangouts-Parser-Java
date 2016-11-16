import java.util.ArrayList;

/**
 * Created by vitz on 15.11.16.
 */
public class Conversation implements IConversation {
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    String conversationID = "";

    public Conversation(String conversationID){
        this.conversationID = conversationID;
    }

    public Conversation(){}


    @Override
    public User getUser(int pos) {
        return null;
    }

    @Override
    public void addUser(User usr) {
        users.add(usr);
    }

    @Override
    public ArrayList<User> getUsers() {
        return this.users;
    }

    @Override
    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    @Override
    public void addMessage(Message msg){
        messages.add(msg);
    }
}