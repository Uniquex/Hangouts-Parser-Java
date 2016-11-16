/**
 * Created by vitz on 14.11.16.
 */
public interface IMessage {

    void setText(String text);
    String getText();
    void setTimestamp(String timestamp);
    String getTimestamp();
    void setUser(User usr);
    User getUser();
    void setCvID(String id);
    String getCvID();
}
