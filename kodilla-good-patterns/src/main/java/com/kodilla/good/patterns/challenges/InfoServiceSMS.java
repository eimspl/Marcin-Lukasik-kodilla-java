package com.kodilla.good.patterns.challenges;

public class InfoServiceSMS implements InfoService{
    public void informUserAboutOrder(User user){
        System.out.println("INFO SERVICE:\nSMS has been sent to " + user.getNickname() + "\n");
    }
}