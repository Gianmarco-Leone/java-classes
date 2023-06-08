package ex11;

public class People {
    // Modella una classe con dati che enumerano (associano a un numero) i nomi di tre
    //amici. Fai in modo che questi dati siano condivisi tra tutte le istanze della classe.
    public static final String [] friends = {"Mario", "Marco", "Francesco"};

    public String[] getFriends() {
        return People.friends;
    }

    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();

        System.out.println(p1.getFriends()[0]);
        System.out.println(p1.getFriends()[1]);
        System.out.println(p1.getFriends()[2]);

        System.out.println(p2.getFriends()[0]);
        System.out.println(p2.getFriends()[1]);
        System.out.println(p2.getFriends()[2]);

        System.out.println(p3.getFriends()[0]);
        System.out.println(p3.getFriends()[1]);
        System.out.println(p3.getFriends()[2]);
    }
}
