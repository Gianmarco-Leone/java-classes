public class Exercise6 {
    // Creare metodo che può essere richiamato senza creare istanza di una classe
    public static void doWithoutInstance() {
        System.out.println("Posso essere utilizzato senza creare istanza di una classe");
    }

    public static void main(String[] args) {
        // doWithoutInstance();
        Exercise6.doWithoutInstance();
    }
}
