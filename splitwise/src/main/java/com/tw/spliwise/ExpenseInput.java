package com.tw.spliwise;

import java.util.*;

public class ExpenseInput {
    public static List<Expense> readInputFromConsole() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter number of people expense to be divided in: ");
            int n = Integer.parseInt(scanner.nextLine());

            Set<String> nameOfParticipants = new HashSet<>();
            System.out.println("Please enter names of participants:");


            for (int i = 0; i < n; i++) {
                nameOfParticipants.add(scanner.nextLine().trim());
            }

            System.out.print("Please enter number of expenses: ");
            int expenseCount = Integer.parseInt(scanner.nextLine());

            List<Expense> expenses = new ArrayList<>();

            for (int i = 0; i < expenseCount; i++) {
                System.out.println("\nExpense #" + (i + 1));

                try {
                    System.out.println("Please enter name of expense: ");
                    String desc = scanner.nextLine();

                    System.out.println("Expense paid by: ");
                    String paidBy = scanner.nextLine().trim();

                    if (!nameOfParticipants.contains(paidBy)) {
                        throw new InvalidExpenseException("Invalid payer name: " + paidBy);
                    }

                    System.out.println("Expense amount: ");
                    double amount = Double.parseDouble(scanner.nextLine());

                    if (amount <= 0) {
                        throw new InvalidExpenseException("Expense amount must be greater than 0.");
                    }

                    System.out.println("Number of participants:  ");
                    int pCount = Integer.parseInt(scanner.nextLine());
                    List<String> participants = new ArrayList<>();

                    for (int j = 0; j < pCount; j++) {
                        System.out.print("Participant " + (j + 1) + ": ");
                        participants.add(scanner.nextLine().trim());
                    }

                    Map<String, Double> shares = new HashMap<>();

                    double share = amount / participants.size();
                    for (String person : participants) {
                        shares.put(person, share);
                        if (!nameOfParticipants.contains(person)) {
                            throw new InvalidExpenseException("Participant name \"" + person + "\" is not in the list of participants.");
                        }
                    }

                    expenses.add(new Expense(paidBy, amount, desc, participants, shares));
                }catch (InvalidExpenseException e) {
                    System.out.println("Invalid expense input:"+e.getMessage());
                    i--;
                }catch (NumberFormatException e) {
                    System.out.println("Invalid number format. Please enter a valid number.");
                    i--;
                }

            }
            return expenses;
        }
        catch (Exception e) {
            System.out.println("Something went wrong while reading input:"+e.getMessage());
            return Collections.emptyList();
        }
    }
}
