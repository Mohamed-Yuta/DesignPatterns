package model;

import model.AccountStatus;

public class BankAccount implements Cloneable {
    private Long id ;
    private double balance ;
    private String currency ;
    private AccountType accountType ;
    private AccountStatus accountStatus;
    private Customer customer ;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "model.BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", accountType=" + accountType +
                ", accountStatus=" + accountStatus +
                ",customer="+customer +
                '}';
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount = (BankAccount) super.clone();
        bankAccount.setCustomer(this.customer.clone());
        return bankAccount;
    }
}
