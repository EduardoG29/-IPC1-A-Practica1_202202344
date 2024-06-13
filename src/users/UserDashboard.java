package users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDashboard extends JFrame {
    private JButton contactListButton;
    private JButton chatButton;
    private JButton reportButton;

    public UserDashboard() {
        setTitle("User Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        contactListButton = new JButton("Lista de Contactos");
        contactListButton.setBounds(10, 10, 200, 25);
        add(contactListButton);

        chatButton = new JButton("Chat");
        chatButton.setBounds(10, 50, 200, 25);
        add(chatButton);

        reportButton = new JButton("Reportar Mensaje");
        reportButton.setBounds(10, 90, 200, 25);
        add(reportButton);

        contactListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ContactList().setVisible(true);
            }
        });

        chatButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ChatWindow().setVisible(true);
            }
        });

        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReportMessage().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }
}
