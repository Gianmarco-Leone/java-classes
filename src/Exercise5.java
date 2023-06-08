public class Exercise5 {
    // Scrivi un metodo che ti consenta di passare qualsiasi numero di stringhe come input di parametro senza utilizzare un array.
    public static void main(String[] args) {
        Exercise5 e5 = new Exercise5();
        e5.test("posso", "inserire", "più", "stringhe");
        e5.test("Anche una sola stringa");
    }

    public void test(String... words) {
        System.out.println(words.length);
    }
}
