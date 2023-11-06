package dev.ironia.ubmailsender.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
