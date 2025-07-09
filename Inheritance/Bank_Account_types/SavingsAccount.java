package Inheritance.Bank_Account_types;

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayCommonDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

