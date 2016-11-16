import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;

/**
 * Created by vitz on 14.11.16.
 */
public class Runner {

    public static void main(String[] args) {
        Parser parser = new Parser();

        String file = "/home/vitz/GIT/Hangouts/jsonsrc/Hangouts.json";

        parser.processJSON(file);
    }
}
