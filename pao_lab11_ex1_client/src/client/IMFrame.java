package client;

import javax.swing.*;
import java.awt.*;

public class IMFrame extends JFrame {

    private String username;

    private JPanel p1 = new JPanel(new BorderLayout());
    private JPanel p2 = new JPanel(new FlowLayout());

    private JTextArea messageBoard = new JTextArea();
    private JTextArea inputText = new JTextArea(5, 30);
    private JButton sendButton = new JButton("SEND");

    public IMFrame(String username) {
        super("Hello, " + username + "!");
        this.username = username;

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(p2, BorderLayout.SOUTH);
        add(p1);

        p1.add(messageBoard);
        p2.add(inputText);
        p2.add(sendButton);

        messageBoard.setEditable(false);
        sendButton.addActionListener(ev -> sendMessage());

        new ReceiveMessageThread().start();

        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void sendMessage() {
        String message = inputText.getText();
        message = username + ": " + message;
        ClientConnectionController.getInstance().sendMessageToServer(message);
        inputText.setText(null);
    }

    private class ReceiveMessageThread extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    String message = ClientConnectionController
                            .getInstance()
                            .receiveMessageFromServer();
                    messageBoard.append(message + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
