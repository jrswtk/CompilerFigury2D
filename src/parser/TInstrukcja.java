package parser;

public class TInstrukcja {

    TProstaInstrukcja prostaInstrukcja = null;
    TZlozonaInstrukcja zlozonaInstrukcja = null;
    TGraficznaInstrukcja graficznaInstrukcja = null;

    public TInstrukcja(TProstaInstrukcja prostaInstrukcja) {
        this.prostaInstrukcja = prostaInstrukcja;
    }

    public TInstrukcja(TGraficznaInstrukcja graficznaInstrukcja) {
        this.graficznaInstrukcja = graficznaInstrukcja;
    }

    public TInstrukcja(TZlozonaInstrukcja zlozonaInstrukcja) {
        this.zlozonaInstrukcja = zlozonaInstrukcja;
    }

    public void wykonaj() {
        if (prostaInstrukcja != null) {
            prostaInstrukcja.wykonaj();
        }
        if (graficznaInstrukcja != null) {
            graficznaInstrukcja.wykonaj();
        }
        if (zlozonaInstrukcja != null) {
            zlozonaInstrukcja.wykonaj();
        }
    }

}
