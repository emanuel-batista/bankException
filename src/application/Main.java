package application;

import model.entities.Account;
import model.exceptions.exceededWithdrawLimitException;
import model.exceptions.notEnoughBalanceException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        try{
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.print("New balance: " + account.getBalance());
        }
        catch (notEnoughBalanceException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (exceededWithdrawLimitException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}
