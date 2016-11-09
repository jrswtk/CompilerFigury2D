package parser;

public class TDeklaracja {

    TZmienne zmienne = null;

    public TDeklaracja(TZmienne zmienne) {
        this.zmienne = zmienne;
    }

    public void wykonaj() {
        zmienne.wykonaj();
    }
}
