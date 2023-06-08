package ex8;

import ex8.bank.Bank;
import ex8.bank.BankManager;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // QUESTO E' IL METODO DI Bank E NON FUNZIONA IN QUESTA CLASSE PERCHE E' package protected, AVREBBE FUNZIONATO SE FOSSE STATO public O protected(ci accedevo con super. )
    // public void (Bank bank) {
        // bank.accessToVault();
    // }

    // QUESTO E' IL METODO DEL BankManager E FUNZIONA IN QUESTA CLASSE PERCHE' E' public
    public void accessToVault(BankManager bankManager, Bank bank) {
        bankManager.accessToVault(bank);
    }

    public static void main(String[] args) {
        Client c1 = new Client("Mario");
        Bank b1 = new Bank("Intesa");
        BankManager bm1 = new BankManager("Francesco");

        c1.accessToVault(bm1, b1);
    }
}
