package models;

public class Message {
    private User from;
    private User to;
    private int[][] content;

    public Message(User from, User to, int[][] content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public int[][] getContent() {
        return content;
    }

    public String getDecryptedContent() {
        return utils.EncryptionUtils.decryptMessage(content);
    }
}
