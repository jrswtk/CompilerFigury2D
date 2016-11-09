package parser;

public class TZmienne {

    TZmienna zmienna = null;
    TZmienne zmienne = null;
    ListaZmiennych listaZmiennych;

    public TZmienne(TZmienna zmienna, TZmienne zmienne, 
            ListaZmiennych listaZmiennych) {
        
        this.zmienna = zmienna;
        this.zmienne = zmienne;
        this.listaZmiennych = listaZmiennych;
    }

    public TZmienne(TZmienna zmienna, ListaZmiennych listaZmiennych) {
        this.zmienna = zmienna;
        this.listaZmiennych = listaZmiennych;
    }

    public void wykonaj() {
        zmienna.wykonaj();
        if (zmienne != null) {
            zmienne.wykonaj();
        }
    }
}
