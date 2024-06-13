package users;

import controllers.ReportController;
import models.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportMessage extends JFrame {
    private JTextField messageField;
    private JButton reportButton;

    public ReportMessage() {
        setTitle("Reportar Mensaje");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        messageField = new JTextField();
        messageField.setBounds(10, 10, 360, 25);
        add(messageField);

        reportButton = new JButton("Reportar");
        reportButton.setBounds(10, 50, 360, 25);
        add(reportButton);

        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String messageContent = messageField.getText();
                User reporter = AuthController.getUser("user"); // assuming the logged-in user is "user"
                if (!messageContent.isEmpty()) {
                    ReportController.reportMessage(reporter, messageContent);
                    JOptionPane.showMessageDialog(null, "Mensaje Reportado");
                    messageField.setText("");
                }
            }
        });
    }
}
