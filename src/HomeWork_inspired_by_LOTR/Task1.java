package HomeWork_inspired_by_LOTR;

import java.io.EOFException;

public class Task1 {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Inside try block");
            throw new EOFException("File is over");

        } catch (EOFException ex) {
            System.out.println(ex.getMessage());

        } finally

        {
            System.out.println("Inside finally block");
        }
        System.out.println("After dangerous try-catch block");
    }


}
