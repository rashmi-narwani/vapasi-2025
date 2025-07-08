package com.tw.spliwise;

public class ExpenseSettlement {
    String from;
    String to;
    double amount;

    public ExpenseSettlement(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s pays %s %.0f", from, to, amount);
    }
}
