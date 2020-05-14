package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCommunicationThread extends Thread {

    private final Socket socket;
    private final BufferedReader in;
    private final PrintWriter out;

    public ClientCommunicationThread(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void sendMessageToClient(String message) {
        out.println(message);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = in.readLine();
                Server.sendMessageToAllConnectedClients(message);
            }
        } catch (Exception e) {
            System.out.println("Client has disconnected...");
        }
    }
}
