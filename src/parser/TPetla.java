package parser;

public class TPetla {

    TWarunek warunek = null;
    TInstrukcja instrukcja = null;

    public TPetla(TWarunek warunek, TInstrukcja instrukcja) {
        this.warunek = warunek;
        this.instrukcja = instrukcja;
    }

    public void wykonaj() {
        while (true) {
            boolean result = warunek.wykonaj();
            if (!result) {
                break;
            }
            instrukcja.wykonaj();
        }
    }
}
