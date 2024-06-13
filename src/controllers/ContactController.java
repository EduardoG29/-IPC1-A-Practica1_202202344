package controllers;

import models.User;

import java.util.List;

public class ContactController {
    public static List<User> getAllContacts() {
        return AuthController.getAllUsers();
    }
}
