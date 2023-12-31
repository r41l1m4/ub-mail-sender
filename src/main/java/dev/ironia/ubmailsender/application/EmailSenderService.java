package dev.ironia.ubmailsender.application;


import dev.ironia.ubmailsender.adapters.EmailSenderGateway;
import dev.ironia.ubmailsender.core.EmailSenderUseCase;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);

    }
}
