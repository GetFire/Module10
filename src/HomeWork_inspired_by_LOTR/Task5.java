package HomeWork_inspired_by_LOTR;

public class Task5 {
    public static void main(String[] args) {
        try {
            Sauron sauron = new Sauron();
            sauron.a();
        } catch (Gandalf | Smeagol | Saruman e) {
            System.err.println(e.getMessage());
        }
        System.out.println("End");

    }
}
