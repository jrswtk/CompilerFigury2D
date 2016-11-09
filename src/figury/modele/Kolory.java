/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figury.modele;

import java.awt.Color;

public enum Kolory {
    
    CZARNY(Color.BLACK),
    NIEBIESKI(Color.BLUE),
    SZARY(Color.GRAY),
    ZIELONY(Color.GREEN),
    ZOLTY(Color.YELLOW),
    CZERWONY(Color.RED),
    POMARANCZOWY(Color.ORANGE),
    BIALY(Color.WHITE),
    BRAZOWY(new Color(139, 69, 19));
    
    private final Color color;
    
    private Kolory(Color color) {    
        this.color = color;
    }
    
    public static Color getKolor(String kolor) {
        for(Kolory k : values()) {
            if(k.toString().equalsIgnoreCase(kolor)) {
                return k.color;
            }
        }
        return null;
    }
}
