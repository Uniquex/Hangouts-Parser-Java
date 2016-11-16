import java.util.ArrayList;

/**
 * Created by vitz on 15.11.16.
 */
public class Conversation implements IConversation {
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private String conversationID;

    public Conversation(String conversationID){
        this.conversationID = conversationID;
    }

    public Conversation(){}


    @Override
    public ArrayList<User> getUser(int pos) {
        return this.users;
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

    @Override
    public String getConversationID() {
        return this.conversationID;
    }

    @Override
    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }
}