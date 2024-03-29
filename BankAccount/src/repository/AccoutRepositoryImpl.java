package repository;

import Director.DirectorAccount;
import model.AccountStatus;
import model.AccountType;
import model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccoutRepositoryImpl implements AccoutRepository {
    private Map<Long,BankAccount> bankAccountMap = new HashMap<>();
    private static final AccoutRepositoryImpl accountRepository ;

    static {
        accountRepository= new AccoutRepositoryImpl();
    }
    private AccoutRepositoryImpl(){

    }
    public static AccoutRepositoryImpl getInstance(){
        return accountRepository;
    }
    private long accoutsNumber = 0 ;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId;
        synchronized (this){
            accountId = ++accoutsNumber ;
        }
        bankAccount.setId(accountId);
        synchronized (this){
            bankAccountMap.put(accountId,bankAccount);
        }
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount bankAccount = bankAccountMap.get(id);
        if(bankAccount==null){
            return Optional.empty();
        }
        else return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {

        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());

    }

    @Override
    public BankAccount update(BankAccount bankAccount) {

        bankAccountMap.put(bankAccount.getId(),bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);

    }
    public void population(){
        BankAccount bankAccount =DirectorAccount.builder()
                .accountBalance(5000)
                .accountStatus(AccountStatus.CREATED)
                .accountType(AccountType.SAVING)
                .accountCurrency("MAD")
                .build();
        save(bankAccount);
        System.out.println(Thread.currentThread().getName());
        System.out.println(accoutsNumber);
    }

}
