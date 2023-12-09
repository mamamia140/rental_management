package com.gtu.rentalmanagement.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Money {

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private double amount;

    public Money(Currency currency, double amount){
        this.currency = currency;
        this.amount = amount;
    }

    public Money() {

    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
