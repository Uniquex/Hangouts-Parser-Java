/**
 * Created by vitz on 15.11.16.
 */
public class Message implements IMessage {
    private String text;
    private String timestamp;



    public Message(String text, String timestamp) {
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
}
