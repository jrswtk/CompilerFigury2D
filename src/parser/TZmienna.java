package parser;

public class TZmienna {

    String nazwaZmiennej = null;
    ListaZmiennych listaZmiennych = null;

    public TZmienna(String nazwaZmiennej, ListaZmiennych listaZmiennych) {
        this.nazwaZmiennej = nazwaZmiennej;
        this.listaZmiennych = listaZmiennych;
    }

    public void wykonaj() {
        listaZmiennych.dodaj(new Zmienna(nazwaZmiennej));
    }
}
