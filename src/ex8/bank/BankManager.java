package ex8.bank;

public class BankManager {
    private String name;

    public BankManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accessToVault(Bank bank) {
        bank.accessToVault(); // Essendo Bank e BankManager nello stesso package posso accedere al metodo di Bank che è package protected
    }
}
