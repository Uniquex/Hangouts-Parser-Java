/**
 * Created by vitz on 15.11.16.
 */
public class Message implements IMessage {
    private String text;
    private String timestamp;
    private User usr;
    private String conversationID;



    public Message(String text, String timestamp, User usr, String cvID) {
        this.setText(text);
        this.setTimestamp(timestamp);
        this.setUser(usr);
        this.setCvID(cvID);
    }
    public Message(String text, String timestamp){
        this.setText(text);
        this.setTimestamp(timestamp);
    }

    @Override
    public void setText(String text) {

    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setTimestamp(String timestamp) {

    }

    @Override
    public String getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void setUser(User usr) {
        this.usr = usr;
    }

    @Override
    public User getUser() {
        return usr;
    }

    @Override
    public void setCvID(String id) {
        this.conversationID = id;
    }

    @Override
    public String getCvID() {
        return this.conversationID;
    }
}
