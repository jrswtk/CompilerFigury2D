package parser;

public class TProgram {

    TDeklaracja deklaracja = null;
    TBlok blok = null;

    public TProgram(TDeklaracja deklaracja, TBlok blok) {
        this.deklaracja = deklaracja;
        this.blok = blok;
    }

    public TProgram(TBlok blok) {
        this.blok = blok;
    }

    public void wykonaj() {
        deklaracja.wykonaj();
        blok.wykonaj();
    }
}
