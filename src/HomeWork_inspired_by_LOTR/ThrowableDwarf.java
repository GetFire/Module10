package HomeWork_inspired_by_LOTR;

public class ThrowableDwarf {
    public void g() throws You_shall_not_pass {
        System.out.println("g inside");
        if (true) throw new You_shall_not_pass();
        System.out.println("g outside");
    }

    public void f() throws You_shall_not_pass {
        System.out.println("f inside");
        g();
        System.out.println("f outside");

    }

}
