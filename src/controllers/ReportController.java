package controllers;

import models.Report;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class ReportController {
    private static List<Report> reports = new ArrayList<>();

    public static void reportMessage(User reporter, String messageContent) {
        reports.add(new Report(reporter, messageContent));
    }

    public static List<Report> getReports() {
        return reports;
    }
}
