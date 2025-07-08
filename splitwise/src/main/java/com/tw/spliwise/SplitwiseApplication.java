package com.tw.spliwise;

import java.util.*;

public class SplitwiseApplication {

    public static void main(String[] args) {
        List<Expense> expenses = ExpenseInput.readInputFromConsole();
        Map<String, Double> balances = BalanceCalculator.calculateBalances(expenses);
        List<String> settlements = BalanceCalculator.settleExpenses(balances);
        BalanceCalculator.printSettlements(settlements);

    }
}
