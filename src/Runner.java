import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;

/**
 * Created by vitz on 14.11.16.
 */
public class Runner {

    public static void main(String[] args) {
        Parser parser = new Parser();

        //Linux
        //String file = "/home/vitz/GIT/Hangouts/jsonsrc/Hangouts.json";
        //Windows
        String file = "C:\\Users\\wvitz\\GIT\\Hangouts-Parser-Java\\jsonsrc\\Hangouts.json";

        parser.processJSON(file);
    }
}
