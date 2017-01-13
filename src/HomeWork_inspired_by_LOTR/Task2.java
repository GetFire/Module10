package HomeWork_inspired_by_LOTR;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello! I`m going to do some dangerous :-)");
            throw new Gandalf("\"You shall not pass!\"  - said Gandalf to Balrog");
        } catch (Gandalf ex) {
            System.out.println(ex.getS());
        }
        System.out.println("Oh no! You've caught my exception! It's not fair :`-(");
    }
}
