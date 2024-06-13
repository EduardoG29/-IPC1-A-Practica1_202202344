package users;

import controllers.ContactController;
import models.User;

import javax.swing.*;
import java.util.List;

public class ContactList extends JFrame {
    private JList<User> contactJList;

    public ContactList() {
        setTitle("Lista de Contactos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        List<User> contacts = ContactController.getAllContacts();
        contactJList = new JList<>(contacts.toArray(new User[0]));
        JScrollPane scrollPane = new JScrollPane(contactJList);
        scrollPane.setBounds(10, 10, 360, 240);
        add(scrollPane);
    }
}
