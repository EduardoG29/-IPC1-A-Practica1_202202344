package models;

public class Report {
    private User reporter;
    private String messageContent;

    public Report(User reporter, String messageContent) {
        this.reporter = reporter;
        this.messageContent = messageContent;
    }

    public User getReporter() {
        return reporter;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
