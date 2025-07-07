package com.tw.spliwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceCalculator {
    public static Map<String, Double> calculateBalances(List<Expense> expenses) {
        Map<String, Double> balances = new HashMap<>();

        for (Expense exp : expenses) {
            balances.put(exp.expensePaidBy, balances.getOrDefault(exp.expensePaidBy, 0.0) + exp.expense);

            for (Map.Entry<String, Double> entry : exp.shares.entrySet()) {
                String person = entry.getKey();
                double share = entry.getValue();
                balances.put(person, balances.getOrDefault(person, 0.0) - share);
            }
        }

        return balances;
    }

    public static boolean hasDebts(Map<String, Double> balances) {
        for (double balance : balances.values()) {
            if (balance < 0) return true;
        }
        return false;
    }

    public static void settleExpenses(Map<String, Double> netBalances) {
        Map<String, Double> balances = new HashMap<>(netBalances);

        boolean hasUnsettledExpense = true;

        while (hasUnsettledExpense) {
            hasUnsettledExpense = false;

            for (String debtor : balances.keySet()) {
                double debt = balances.get(debtor);
                if (debt >= 0) continue;

                for (String creditor : balances.keySet()) {
                    if (debtor.equals(creditor)) continue;

                    double credit = balances.get(creditor);
                    if (credit <= 0) continue;

                    double amount = Math.min(-debt, credit);

                    System.out.printf("%s pays %s %.2f%n", debtor, creditor, amount);

                    balances.put(debtor, debt + amount);
                    balances.put(creditor, credit - amount);

                    hasUnsettledExpense = true;
                    break;
                }

                if (hasUnsettledExpense) break;
            }
        }
    }
}
