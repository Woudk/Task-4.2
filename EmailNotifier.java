package org.colleg.practice2.task5;

public class EmailNotifier implements Observer{
    private String emailAddress;

    public EmailNotifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String message) {
        System.out.println("Email sent to " + emailAddress + ": " + message);
    }
}
