package dev.ironia.ubmailsender.application;


import dev.ironia.ubmailsender.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
