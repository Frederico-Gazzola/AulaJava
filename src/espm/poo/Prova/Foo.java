package src.espm.poo.Prova;

public class Foo {
    Bar mybar = new Bar();

    public void changeit (Bar mybar) {
        mybar.barNum = 99;
        System.out.println(mybar.barNum);
        mybar = new Bar();
        mybar.barNum = 420;
        System.out.println(mybar.barNum);
    }
}
