/**
 * Created by vitz on 14.11.16.
 */

import jdk.nashorn.internal.parser.JSONParser;
import org.json.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Parser {


    public void processJSON(String path){

        ArrayList<User> users = new ArrayList<>();

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
                users.add(new User(usrdata.getString("fallback_name")));

            }

            for (User usr : users)
            {
                System.out.println(usr.getName());
            }



            System.out.println("");




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





    }
}
