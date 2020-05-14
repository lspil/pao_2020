package client;

import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name:");
        new IMFrame(name);
    }
}
