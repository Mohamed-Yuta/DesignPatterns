import model.AccountType;
import model.BankAccount;
import repository.AccoutRepositoryImpl;
import utils.JsonSerializer;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> jsonSerializer = new JsonSerializer<>();
        AccoutRepositoryImpl accoutRepository = AccoutRepositoryImpl.getInstance();
        for (int i =0 ; i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    accoutRepository.population();
                }
            }).start();
        }
        System.out.println("Tapper un caractere");
        System.in.read();
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