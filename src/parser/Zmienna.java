package parser;

public class Zmienna {

    String nazwa;
    String string;
    int wartosc;

    public Zmienna(String nazwa) {
        this.nazwa = nazwa;
        wartosc = 0;
    }

    public String pobierzNazwa() {
        return nazwa;
    }

    public int pobierzWartosc() {
        return wartosc;
    }

    public void zmienWartosc(int w) {
        wartosc = w;
    }

    public void zmienWartoscString(String s) {
        string = s;
    }

    public String getString() {
        return string;
    }

}
