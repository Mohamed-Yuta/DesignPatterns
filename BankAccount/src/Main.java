import model.AccountType;
import model.BankAccount;
import repository.AccoutRepositoryImpl;
import utils.JsonSerializer;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> jsonSerializer = new JsonSerializer<>();
        AccoutRepositoryImpl accoutRepository = AccoutRepositoryImpl.getInstance();
        accoutRepository.population();
        List<BankAccount> bankAccountList = accoutRepository.searchAccounts(new Predicate<BankAccount>() {
            @Override
            public boolean test(BankAccount bankAccount) {
                return bankAccount.getAccountType().equals(AccountType.CURRENT);
            }
        });
        List<BankAccount> bankAccounts =accoutRepository.findAll();
        bankAccounts.stream().map(jsonSerializer::toJson).forEach(System.out::println);
    }
}