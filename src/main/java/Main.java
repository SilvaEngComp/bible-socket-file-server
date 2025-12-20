
import com.eliabe.bible.application.service.BibleClient;
import com.eliabe.bible.application.service.SocketBibleServer;


import static java.lang.Thread.sleep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        SocketBibleServer.startServer();
        sleep(10);
        BibleClient.clientCall();
    }
}