package users;

import controllers.AuthController;
import controllers.ChatController;
import models.Message;
import models.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;
    private JComboBox<User> userDropdown;

    public ChatWindow() {
        setTitle("Chat");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        chatArea = new JTextArea();
        chatArea.setBounds(10, 10, 360, 200);
        add(chatArea);

        messageField = new JTextField();
        messageField.setBounds(10, 220, 260, 25);
        add(messageField);

        sendButton = new JButton("Enviar");
        sendButton.setBounds(280, 220, 90, 25);
        add(sendButton);

        userDropdown = new JComboBox<>();
        for (User user : AuthController.getAllUsers()) {
            userDropdown.addItem(user);
        }
        userDropdown.setBounds(10, 250, 360, 25);
        add(userDropdown);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User selectedUser = (User) userDropdown.getSelectedItem();
                String message = messageField.getText();
                User fromUser = AuthController.getUser("user"); // assuming the logged-in user is "user"
                if (selectedUser != null && !message.isEmpty()) {
                    ChatController.sendMessage(fromUser, selectedUser, message);
                    chatArea.append("To " + selectedUser.getUsername() + ": " + message + "\n");
                    messageField.setText("");
                }
            }
        });
    }
}
