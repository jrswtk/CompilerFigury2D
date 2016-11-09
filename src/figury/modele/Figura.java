package figury.modele;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;

public class Figura {

    private Color kolor;
    private int x;
    private int y;
    private int x1, x2;
    private int y1, y2;
    private int szerokosc;
    private int wysokosc;

    public Figura(int x, int y, int rozmiar, String kolor) {
        this.x = x;
        this.y = y;
        this.szerokosc = rozmiar;
        this.wysokosc = rozmiar;
        this.kolor = Kolory.getKolor(kolor);
    }

    public Figura(int x, int y, int szerokosc, int wysokosc, String kolor) {
        this.x = x;
        this.y = y;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.kolor = Kolory.getKolor(kolor);
    }

    public Figura(int x, int y, int x1, int y1, int x2, int y2, String kolor) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.kolor = Kolory.getKolor(kolor);
    }

    public Color getKolor() {
        return kolor;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
}
