import model.AccountStatus;
import model.AccountType;
import model.BankAccount;
import model.Customer;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.setId(1L);
        bankAccount.setAccountStatus(AccountStatus.ACTIVATED);
        bankAccount.setAccountType(AccountType.SAVING);
        bankAccount.setCurrency("MAD");
        bankAccount.setBalance(5000);
        bankAccount.setCustomer(new Customer(1L,"Amine"));
        BankAccount bankAccount1 = bankAccount.clone();
        bankAccount.getCustomer().setName("Ahmed");
        System.out.println(bankAccount);
        System.out.println(bankAccount1);

    }
}
