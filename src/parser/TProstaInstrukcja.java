package parser;

import figury.modele.Figura;
import java.util.ArrayList;

public class TProstaInstrukcja {

    public static ArrayList<Figura> figury = new ArrayList<Figura>();

    String nazwaZmiennej;
    TWyrazenie wyrazenie = null;
    ListaZmiennych listaZmiennych = null;

    public TProstaInstrukcja(String nazwaZmiennej, TWyrazenie wyrazenie,
            ListaZmiennych listaZmiennych) {
        this.nazwaZmiennej = nazwaZmiennej;
        this.wyrazenie = wyrazenie;
        this.listaZmiennych = listaZmiennych;
    }

    public TProstaInstrukcja(TWyrazenie wyrazenie) {
        this.wyrazenie = wyrazenie;
    }

    public void wykonaj() {
        if (nazwaZmiennej != null) {

            Zmienna zmienna = listaZmiennych.pobierzWedlugNazwy(nazwaZmiennej);

            if (zmienna != null) {
                if (wyrazenie.isString()) {
                    zmienna.zmienWartoscString((String) wyrazenie.wykonaj());
                } else {
                    int wartosc = (Integer) wyrazenie.wykonaj();
                    zmienna.zmienWartosc(wartosc);
                }
            } else {
                throw new Error("Nie moge znalezc zmiennej o nazwie: " + nazwaZmiennej);

            }
        } else {
            if (wyrazenie != null) {
                if (wyrazenie.isString()) {
                    String wartosc = wyrazenie.wykonajString();
                } else {
                    int wartosc = (Integer) wyrazenie.wykonaj();
                }
            }
        }
    }

}
