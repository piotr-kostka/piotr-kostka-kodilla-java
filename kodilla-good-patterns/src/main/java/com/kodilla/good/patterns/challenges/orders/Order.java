package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private LocalDateTime orderDate;

    public Order(User user, LocalDateTime orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
