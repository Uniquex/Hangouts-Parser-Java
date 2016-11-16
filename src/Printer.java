/**
 * Created by wvitz on 16.11.2016.
 */
public class Printer {
    Conversation conv;
    public Printer(Conversation conv){
        this.conv = conv;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(printWelcome());
        sb.append(printUsers());
        sb.append(printConversation());

        return sb.toString();

    }

    public String printWelcome(){
        String st ="Printing Conversation: "+ conv.getConversationID()+"\n";

        return st;
    }

    public String printUsers(){
        StringBuilder sb = new StringBuilder();
        sb.append("Participants are: \n");

        for(User usr : conv.getUsers()){
            sb.append("----  " + usr.getName() + "\n");
        }

        return sb.toString();
    }

    public String printConversation(){
        StringBuilder sb = new StringBuilder();
        for(Message msg : conv.getMessages()){
            sb.append(msg.getUser().getName()+" |  "+msg.getText()+"\n");
        }

        return sb.toString();
    }
}
