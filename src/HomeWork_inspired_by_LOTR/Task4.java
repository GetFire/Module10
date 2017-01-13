package HomeWork_inspired_by_LOTR;

public class Task4 {
    public static void main(String[] args) {
        try {
            ThrowableDwarf dwarf = new ThrowableDwarf();
            dwarf.f();
        } catch (Gandalf ex) {

// Хотел бросить новое исключение но
// компилятор не пропускает, пришлось сделать вложенный try-catch

            try {
                System.out.println("\"Mu-ha-ha\" - said Balrog and tossed a Dwarf!");
                throw new Smeagol("SMEAGOL IS FREE!");
            } catch (Smeagol s) {
                System.out.println(s.getMessage());
            }
        }
    }
}
