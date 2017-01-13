package HomeWork_inspired_by_LOTR;

public class Gandalf extends Exception {
    private  String s;
    public Gandalf(String message) {
        s=message;
    }

    public String getS() {
        return s;
    }

    public Gandalf() {
        super("You shall not pass!");

    }
}
