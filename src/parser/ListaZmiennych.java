package parser;

import java.util.ArrayList;

public class ListaZmiennych {

    ArrayList<Zmienna> listaZmiennych;

    public ListaZmiennych() {
        listaZmiennych = new ArrayList<Zmienna>();
    }

    public void dodaj(Zmienna z) {
        listaZmiennych.add(z);
    }

    public Zmienna pobierz(int indeks) {
        return listaZmiennych.get(indeks);
    }

    public Zmienna pobierzWedlugNazwy(String nazwa) {
        for (int i = 0; i < rozmiar(); i++) {
            Zmienna z = pobierz(i);
            if (z.pobierzNazwa().equalsIgnoreCase(nazwa)) {
                return z;
            }
        }

        return null;
    }

    int rozmiar() {
        return listaZmiennych.size();
    }

}
