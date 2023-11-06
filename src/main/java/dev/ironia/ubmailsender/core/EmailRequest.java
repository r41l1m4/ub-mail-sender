package dev.ironia.ubmailsender.core;

public record EmailRequest(String to, String subject, String body) {
}
