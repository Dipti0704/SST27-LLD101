package com.example.notifications;

public class WhatsappDecorator extends NotifierDecorator {
    private final String username;

    public WhatsappDecorator(Notifier wrappee, String username) {
        super(wrappee);
        this.username = username;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[WhatsApp -> " + username + "]: " + text);
    }
}