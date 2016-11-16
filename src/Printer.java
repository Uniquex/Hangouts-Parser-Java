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
        String st ="Welcome\nPrinting Conversation: "+ conv.getConversationID()+"\n";

        return st;
    }

    public String printUsers(){
        StringBuilder sb = new StringBuilder();
        sb.append("Participants are: \n");

        for(User usr : conv.getUsers()){
            sb.append("----  " + usr.getName() + "\n");
        }

        sb.append("-\n");

        return sb.toString();
    }

    public String printConversation(){
        StringBuilder sb = new StringBuilder();

        for(Message msg : conv.getMessages()){
            int y = 0;
            StringBuilder sb2 = new StringBuilder();
            for(User user : conv.getUsers()){
                if(y < user.getName().length()){
                    y = user.getName().length();
                }
            }

            sb2.append(msg.getUser().getName());

            while (sb2.length()<y+1){
                sb2.append(" ");
            }
            sb.append(sb2.toString() +"|  "+msg.getText()+"\n");
        }

        return sb.toString();
    }
}
