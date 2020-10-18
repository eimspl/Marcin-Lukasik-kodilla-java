package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("User: " + user.getNickName() + " informed.");
    }
}
