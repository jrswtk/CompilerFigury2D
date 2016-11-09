/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import figury.modele.Figura;
import figury.modele.Figury;
import figury.obiekty.Elipsa;
import figury.obiekty.Kolo;
import figury.obiekty.Kwadrat;
import figury.obiekty.Prostokat;
import figury.obiekty.Trojkat;
import java.util.ArrayList;

public class TGraficznaInstrukcja {

    public static ArrayList<Figura> figury = new ArrayList<Figura>();

    String nazwaZmiennej;
    TWyrazenie wyrazenie = null;
    ListaZmiennych listaZmiennych = null;

    TWyrazenie x = null;
    TWyrazenie y = null;
    TWyrazenie x1 = null;
    TWyrazenie y1 = null;
    TWyrazenie x2 = null;
    TWyrazenie y2 = null;
    TWyrazenie szer = null;
    TWyrazenie wys = null;
    TWyrazenie kolor = null;
    TWyrazenie figura = null;

    public TGraficznaInstrukcja(TWyrazenie figura, TWyrazenie x, TWyrazenie y,
            TWyrazenie szer, TWyrazenie kolor,
            ListaZmiennych listaZmiennych) {

        this.figura = figura;
        this.x = x;
        this.y = y;
        this.szer = szer;
        this.kolor = kolor;
        this.listaZmiennych = listaZmiennych;
    }

    public TGraficznaInstrukcja(TWyrazenie figura, TWyrazenie x, TWyrazenie y,
            TWyrazenie szer, TWyrazenie wys, TWyrazenie kolor,
            ListaZmiennych listaZmiennych) {

        this.figura = figura;
        this.x = x;
        this.y = y;
        this.szer = szer;
        this.wys = wys;
        this.kolor = kolor;
        this.listaZmiennych = listaZmiennych;
    }

    public TGraficznaInstrukcja(TWyrazenie figura, TWyrazenie x, TWyrazenie y,
            TWyrazenie x1, TWyrazenie y1, TWyrazenie x2, TWyrazenie y2,
            TWyrazenie kolor, ListaZmiennych listaZmiennych) {

        this.figura = figura;
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.kolor = kolor;
        this.listaZmiennych = listaZmiennych;
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
                throw new Error("Nie moge znalezc zmiennej o nazwie: " 
                        + nazwaZmiennej);
            }
        } else {
            if (wyrazenie != null) {
                if (wyrazenie.isString()) {
                    String wartosc = wyrazenie.wykonajString();
                } else {
                    int wartosc = (Integer) wyrazenie.wykonaj();
                }
            }

            String iFigura = null;
            int iX = 0;
            int iY = 0;
            int iX1 = 0;
            int iY1 = 0;
            int iX2 = 0;
            int iY2 = 0;
            int iSzer = 0;
            int iWys = 0;
            String iKolor = null;

            try {
                if (listaZmiennych.pobierzWedlugNazwy(figura
                        .getSkladnik()
                        .getNazwaZmiennej())
                        .getString() != null) {

                    iFigura = listaZmiennych.pobierzWedlugNazwy(figura
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .getString();

                } else {
                    throw new Error("Błąd - nazwa figury");
                }

                if (listaZmiennych.pobierzWedlugNazwy(x
                        .getSkladnik()
                        .getNazwaZmiennej())
                        .pobierzWartosc() > 0) {

                    iX = listaZmiennych.pobierzWedlugNazwy(x
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc();
                    
                } else {
                    throw new Error("Błąd - zmienna x");
                }

                if (listaZmiennych.pobierzWedlugNazwy(y
                        .getSkladnik()
                        .getNazwaZmiennej())
                        .pobierzWartosc() > 0) {

                    iY = listaZmiennych.pobierzWedlugNazwy(y
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc();

                } else {
                    throw new Error("Błąd - zmienna y");
                }

                if (!iFigura.toUpperCase().equals(Figury.TROJKAT.toString())) {
                    if (listaZmiennych.pobierzWedlugNazwy(szer
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc() > 0) {

                        iSzer = listaZmiennych.pobierzWedlugNazwy(szer
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna szerokosc");
                    }
                }

                if (!iFigura.toUpperCase().equals(Figury.KWADRAT.toString())
                        && !iFigura.toUpperCase().equals(Figury.KOLO.toString())
                        && !iFigura.toUpperCase().equals(Figury.TROJKAT.toString())) {

                    if (listaZmiennych.pobierzWedlugNazwy(wys
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc() > 0) {

                        iWys = listaZmiennych.pobierzWedlugNazwy(wys
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna wysokosc");
                    }
                }

                if (iFigura.toUpperCase().equals(Figury.TROJKAT.toString())) {
                    if (listaZmiennych.pobierzWedlugNazwy(x1.getSkladnik()
                            .getNazwaZmiennej()).pobierzWartosc() > 0) {

                        iX1 = listaZmiennych.pobierzWedlugNazwy(x1
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna x1");
                    }

                    if (listaZmiennych.pobierzWedlugNazwy(y1
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc() > 0) {

                        iY1 = listaZmiennych.pobierzWedlugNazwy(y1
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna y1");
                    }

                    if (listaZmiennych.pobierzWedlugNazwy(x2
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc() > 0) {

                        iX2 = listaZmiennych.pobierzWedlugNazwy(x2
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna x2");
                    }

                    if (listaZmiennych.pobierzWedlugNazwy(y2
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .pobierzWartosc() > 0) {

                        iY2 = listaZmiennych.pobierzWedlugNazwy(y2
                                .getSkladnik()
                                .getNazwaZmiennej())
                                .pobierzWartosc();

                    } else {
                        throw new Error("Błąd - zmienna y2");
                    }
                }

                if (listaZmiennych.pobierzWedlugNazwy(kolor
                        .getSkladnik()
                        .getNazwaZmiennej())
                        .getString() != null) {

                    iKolor = listaZmiennych.pobierzWedlugNazwy(kolor
                            .getSkladnik()
                            .getNazwaZmiennej())
                            .getString();

                } else {
                    throw new Error("Błąd - nazwa koloru");
                }

            } catch (NullPointerException e) {
                System.err.println("Błąd w definiowaniu figury");
                System.exit(0);
            } catch (Error e) {
                System.err.println("Błąd w definiowaniu zmiennej: " + e.getMessage());
                System.exit(0);
            }

            Figura figura = null;

            if (iFigura.toUpperCase().equals(Figury.KWADRAT.toString())) {
                figura = new Kwadrat(iX, iY, iSzer, iKolor);
            }
            if (iFigura.toUpperCase().equals(Figury.PROSTOKAT.toString())) {
                figura = new Prostokat(iX, iY, iSzer, iWys, iKolor);
            }
            if (iFigura.toUpperCase().equals(Figury.ELIPSA.toString())) {
                figura = new Elipsa(iX, iY, iSzer, iWys, iKolor);
            }
            if (iFigura.toUpperCase().equals(Figury.KOLO.toString())) {
                figura = new Kolo(iX, iY, iSzer, iKolor);
            }
            if (iFigura.toUpperCase().equals(Figury.TROJKAT.toString())) {
                figura = new Trojkat(iX, iY, iX1, iY1, iX2, iY2, iKolor);
            }
            figury.add(figura);
        }
    }

}
