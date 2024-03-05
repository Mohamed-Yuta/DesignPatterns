import model.BankAccount;
import repository.AccoutRepositoryImpl;
import utils.JsonSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> jsonSerializer = new JsonSerializer<>();
        AccoutRepositoryImpl accoutRepository = new AccoutRepositoryImpl();
        accoutRepository.population();
        List<BankAccount> bankAccounts =accoutRepository.findAll();
        bankAccounts.stream().map(acc->jsonSerializer.toJson(acc)).forEach(System.out::println);
    }
}