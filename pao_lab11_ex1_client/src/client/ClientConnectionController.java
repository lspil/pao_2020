package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientConnectionController {

    private BufferedReader in;
    private PrintWriter out;

    private ClientConnectionController() {
        try {
            Socket socket = new Socket("localhost", 4444);
            this.in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            this.out = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessageToServer(String message) {
        out.println(message);
    }

    public String receiveMessageFromServer() throws IOException {
        return in.readLine();
    }

    public static ClientConnectionController getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        private static final ClientConnectionController INSTANCE =
                new ClientConnectionController();
    }
}
