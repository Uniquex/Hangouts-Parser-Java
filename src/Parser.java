/**
 * Created by vitz on 14.11.16.
 */

import org.json.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Parser {


    public Conversation processJSON(String path){

        Conversation conv = new Conversation();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                sb.append(line);
            }

            JSONObject jason = new JSONObject(sb.toString());
            JSONArray participants = jason.getJSONArray("conversation_state").getJSONObject(0).getJSONObject("conversation_state").getJSONObject("conversation").getJSONArray("participant_data");


            for(int x = 0; x < participants.length(); x++)
            {
                JSONObject usrdata = participants.getJSONObject(x);
                conv.addUser(new User(usrdata.getString("fallback_name"), usrdata.getJSONObject("id").getString("gaia_id")));

            }

            JSONObject zero = jason.getJSONArray("conversation_state").getJSONObject(0);
            conv.conversationID = zero.getJSONObject("conversation_id").getString("id");

            JSONArray conversation = zero.getJSONObject("conversation_state").getJSONArray("event");

            for(int y = 0; y < conversation.length(); y++){
                JSONObject tmp = conversation.getJSONObject(y);

                for(User usr : conv.getUsers()){
                    if(usr.getUserID().equals(tmp.getJSONObject("sender_id").getString("gaia_id")) && conv.conversationID.equals(tmp.getJSONObject("conversation_id").getString("id"))){
                        conv.addMessage(new Message(tmp.getJSONObject("chat_message").getJSONObject("message_content").getJSONArray("segment").getJSONObject(0).getString("text"),
                                                    tmp.getString("timestamp"),
                                                    usr,
                                                    tmp.getJSONObject("conversation_id").getString("id")));
                    }
                }
            }
         }
        catch(JSONException jsexc){
            System.out.println("JSON konnte nicht gelesen werden!");
            System.out.println(jsexc.getMessage());
        }
        catch(FileNotFoundException fnfexc){
            System.out.println("File not found!");
        }
        catch(java.io.IOException xx ){
            System.out.println("IO exception");
        }


        return conv;


    }
}
