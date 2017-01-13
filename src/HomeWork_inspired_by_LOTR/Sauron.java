package HomeWork_inspired_by_LOTR;

/**
 * Created by User on 13.01.2017.
 */
public class Sauron {
    public void a() throws You_shall_not_pass,Smeagol,Saruman {
        int r = (int) (Math.random() * 4);
        switch (r) {
            case 1:
                throw new You_shall_not_pass();
            case 2:
                throw new Smeagol();
            case 3:
                throw new Saruman();
        }
    }
}
