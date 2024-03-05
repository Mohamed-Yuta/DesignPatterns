package Director;

import model.AccountStatus;
import model.AccountType;
import model.BankAccount;

public class BuilderAccount {
    public BankAccount bankAccount = new BankAccount();
    public BankAccount build(){
        return bankAccount;
    }
    public BuilderAccount accountId(Long id){
        bankAccount.setId(id);
        return this;
    }
    public BuilderAccount accountBalance(double balance){
        bankAccount.setBalance(balance);
        return this;
    }
    public BuilderAccount accountCurrency(String currency){
        bankAccount.setCurrency(currency);
        return this;
    }
    public BuilderAccount accountType(AccountType accountType) {
        bankAccount.setAccountType(accountType);
        return this;
    }
    public BuilderAccount accountStatus(AccountStatus accountStatus) {
        bankAccount.setAccountStatus(accountStatus);
        return this;
    }

}
