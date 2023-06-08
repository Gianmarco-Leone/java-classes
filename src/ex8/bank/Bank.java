package ex8.bank;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Devo creare un metodo accessibile dal direttore di banca ma non direttamente accessibile per il cliente
    void accessToVault() {
        System.out.println("Sono nel caveau");
    }

    // Creo il toString solo per fare un tentavio di stampa nella classe Client
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
