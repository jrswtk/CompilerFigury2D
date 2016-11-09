package parser;

public class TSkladnik {

    Integer liczba = null;
    String nazwaZmiennej = null;
    ListaZmiennych listaZmiennych = null;
    String string = null;
    boolean isString = false;

    public TSkladnik(String string) {
        this.string = string;
        isString = true;
    }

    public TSkladnik(Integer liczba) {
        this.liczba = liczba;
    }

    public boolean isIsString() {
        return isString;
    }

    public TSkladnik(String nazwaZmiennej, ListaZmiennych listaZmiennych) {
        this.nazwaZmiennej = nazwaZmiennej;
        this.listaZmiennych = listaZmiennych;
    }

    public Object wykonaj() {
        if (liczba != null) {
            return liczba.intValue();
        } else {
            Zmienna zmienna = listaZmiennych.pobierzWedlugNazwy(nazwaZmiennej);

            if (string != null) {
                return zmienna.getString();
            }
            if (zmienna != null) {
                return zmienna.pobierzWartosc();
            } else {
                throw new Error("Nie moge znalezc zmiennej o nazwie: " 
                        + nazwaZmiennej);
            }
        }
    }

    public String wykonajString() {
        return string;
    }

    public String getString() {
        return string;
    }

    public String getNazwaZmiennej() {
        return nazwaZmiennej;
    }

    public ListaZmiennych getListaZmiennych() {
        return listaZmiennych;
    }

}
