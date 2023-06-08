package ex9;

public class Client {
    // Come puoi assicurarti che un'istanza del cliente non possa essere creata senza un nome e una giacenza bancaria iniziale?
    private String name;
    private float deposit;

    public Client(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public static void main(String[] args) {
        Client c1 = new Client("Mario", 246.78f);
    }
}
