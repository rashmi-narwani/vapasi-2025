package com.tw.spliwise;

import java.util.List;
import java.util.Map;

public class Expense {
    String expensePaidBy;
    double expense;
    String expenseName;
    List<String> participants;
    Map<String, Double> shares;

    public Expense(String expensePaidBy, double expense, String expenseName, List<String> participants, Map<String, Double> shares) {
        this.expensePaidBy = expensePaidBy;
        this.expense = expense;
        this.expenseName = expenseName;
        this.participants = participants;
        this.shares = shares;
    }


}
