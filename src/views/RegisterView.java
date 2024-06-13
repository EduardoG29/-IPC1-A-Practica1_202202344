package views;

import controllers.AuthController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField phoneNumberField;
    private JComboBox<String> genderComboBox;
    private JButton registerButton;

    public RegisterView() {
        setTitle("Registro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usernameLabel = new JLabel("Usuario:");
        usernameLabel.setBounds(10, 10, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(100, 10, 160, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 40, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 40, 160, 25);
        add(passwordField);

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(10, 70, 80, 25);
        add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(100, 70, 160, 25);
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Apellido:");
        lastNameLabel.setBounds(10, 100, 80, 25);
        add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(100, 100, 160, 25);
        add(lastNameField);

        JLabel phoneNumberLabel = new JLabel("Teléfono:");
        phoneNumberLabel.setBounds(10, 130, 80, 25);
        add(phoneNumberLabel);

        phoneNumberField = new JTextField();
        phoneNumberField.setBounds(100, 130, 160, 25);
        add(phoneNumberField);

        JLabel genderLabel = new JLabel("Sexo:");
        genderLabel.setBounds(10, 160, 80, 25);
        add(genderLabel);

        genderComboBox = new JComboBox<>(new String[]{"Masculino", "Femenino"});
        genderComboBox.setBounds(100, 160, 160, 25);
        add(genderComboBox);

        registerButton = new JButton("Registrar");
        registerButton.setBounds(10, 200, 250, 25);
        add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String phoneNumber = phoneNumberField.getText();
                String gender = (String) genderComboBox.getSelectedItem();
                if (AuthController.register(username, password, firstName, lastName, phoneNumber, gender)) {
                    dispose();
                    new LoginView().setVisible(true);
                }
            }
        });
    }
}
