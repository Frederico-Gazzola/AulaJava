package src.espm.poo.Prova;

public class TesteFoo {
    public static void main(String [] args) {
        Foo f = new Foo();
        System.out.println(f.mybar.barNum);
        f.changeit(f.mybar);
        System.out.println(f.mybar.barNum);
    }
}
