package parser;

public class TZlozonaInstrukcja {

    TBlok blok = null;
    TWarunkowa warunkowa = null;
    TPetla petla = null;

    public TZlozonaInstrukcja(TBlok blok) {
        this.blok = blok;
    }

    public TZlozonaInstrukcja(TWarunkowa warunkowa) {
        this.warunkowa = warunkowa;
    }

    public TZlozonaInstrukcja(TPetla petla) {
        this.petla = petla;
    }

    public void wykonaj() {
        if (blok != null) {
            blok.wykonaj();
        }
        if (warunkowa != null) {
            warunkowa.wykonaj();
        }
        if (petla != null) {
            petla.wykonaj();
        }
    }

}
