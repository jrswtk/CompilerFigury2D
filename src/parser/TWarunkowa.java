package parser;

public class TWarunkowa {

    TWarunek warunek = null;
    TInstrukcja instrukcja1 = null;
    TInstrukcja instrukcja2 = null;

    public TWarunkowa(TWarunek warunek, TInstrukcja instrukcja) {
        this.warunek = warunek;
        this.instrukcja1 = instrukcja;
    }

    public void wykonaj() {
        boolean result = warunek.wykonaj();

        if (instrukcja2 == null) {
            if (result) {
                instrukcja1.wykonaj();
            }
        }
    }
}
