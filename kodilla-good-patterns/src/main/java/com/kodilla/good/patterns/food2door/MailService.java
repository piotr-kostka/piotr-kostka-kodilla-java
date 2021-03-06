package com.kodilla.good.patterns.food2door;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("E-mail order confirmation send to: " + user);
    }
}
