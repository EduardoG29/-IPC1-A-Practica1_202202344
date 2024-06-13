package controllers;

import models.Message;
import models.User;
import utils.EncryptionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatController {
    private static Map<User, List<Message>> userMessages = new HashMap<>();

    public static void sendMessage(User from, User to, String content) {
        Message message = new Message(from, to, EncryptionUtils.encryptMessage(content));
        userMessages.computeIfAbsent(to, k -> new ArrayList<>()).add(message);
    }

    public static List<Message> getMessages(User user) {
        return userMessages.getOrDefault(user, new ArrayList<>());
    }
}
