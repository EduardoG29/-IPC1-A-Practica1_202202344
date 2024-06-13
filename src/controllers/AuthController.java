package controllers;

import models.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AuthController {
    private static List<User> users = new ArrayList<>();

    static {
        // Adding a default user for demonstration purposes
        users.add(new User("user", "password", "Default", "User", "1234567890", "Masculino"));
    }

    public static boolean authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean register(String username, String password, String firstName, String lastName, String phoneNumber, String gender) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya está registrado");
                return false;
            }
        }
        users.add(new User(username, password, firstName, lastName, phoneNumber, gender));
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        return true;
    }

    public static User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> getAllUsers() {
        return users;
    }
}
