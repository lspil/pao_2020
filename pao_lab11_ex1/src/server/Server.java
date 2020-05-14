package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static List<ClientCommunicationThread> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(4444);
            while (true) {
                System.out.println("Waiting for a client...");
                Socket client = server.accept();  // blocheaza firul de exec curent
                System.out.println("A client has just connected...");
                ClientCommunicationThread t = new ClientCommunicationThread(client);
                t.start();
                clients.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMessageToAllConnectedClients(String message) {
        clients.forEach(c -> c.sendMessageToClient(message));
    }
}
