import composite.File;
import composite.Folder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Folder folder = new Folder("/");
        folder.add(new File("java.txt"));
        folder.add(new File("application.properties"));
        Folder folder1 = (Folder) folder.add(new Folder("entities"));
        Folder folder2 = (Folder) folder.add(new Folder("security"));
        Folder folder3 = (Folder) folder.add(new Folder("dtos"));
        folder1.add(new File("Customer.java"));
        folder1.add(new File("BankAccount.java"));
        folder.print();
    }
}