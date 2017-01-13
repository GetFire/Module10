package HomeWork_inspired_by_LOTR;

public class You_shall_not_pass extends Exception {
    private  String s;
    public You_shall_not_pass(String message) {
        s=message;
    }

    public String getS() {
        return s;
    }

    public You_shall_not_pass() {
    }
}
