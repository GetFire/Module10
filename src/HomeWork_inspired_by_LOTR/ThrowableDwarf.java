package HomeWork_inspired_by_LOTR;

public class ThrowableDwarf {
    public void g() throws Gandalf {
        System.out.println("g inside");
        if (true) throw new Gandalf();
        System.out.println("g outside");
    }

    public void f() throws Gandalf {
        System.out.println("f inside");
        g();
        System.out.println("f outside");

    }

}
