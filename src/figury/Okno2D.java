package figury;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import figury.modele.Figura;
import figury.obiekty.Elipsa;
import figury.obiekty.Kolo;
import figury.obiekty.Kwadrat;
import figury.obiekty.Prostokat;
import figury.obiekty.Trojkat;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import parser.TGraficznaInstrukcja;

public class Okno2D extends JFrame {

    JFrame frame = null;
    ArrayList<Figura> figury = null;

    public Okno2D() {
        super("Figury2D");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) (dimension.width * 0.8), (int) (dimension.height * 0.8));
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        figury = TGraficznaInstrukcja.figury;
        setContentPane(new DrawPanel());
    }

    private class DrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            for (Figura f : figury) {
                g.setColor(f.getKolor());
                
                if (f instanceof Kwadrat) {
                    g.fillRect(
                            ((Kwadrat) f).getX(), 
                            ((Kwadrat) f).getY(), 
                            ((Kwadrat) f).getSzerokosc(), 
                            ((Kwadrat) f).getWysokosc());
                }
                
                if (f instanceof Prostokat) {
                    g.fillRect(
                            ((Prostokat) f).getX(), 
                            ((Prostokat) f).getY(), 
                            ((Prostokat) f).getSzerokosc(), 
                            ((Prostokat) f).getWysokosc());
                }
                
                if (f instanceof Elipsa) {
                    g.fillOval(
                            ((Elipsa) f).getX(), 
                            ((Elipsa) f).getY(),
                            ((Elipsa) f).getSzerokosc(), 
                            ((Elipsa) f).getWysokosc());
                }
                
                if (f instanceof Kolo) {
                    g.fillOval(
                            ((Kolo) f).getX(), 
                            ((Kolo) f).getY(),
                            ((Kolo) f).getSzerokosc(),
                            ((Kolo) f).getWysokosc());
                }
                
                if (f instanceof Trojkat) {
                    int[] xPoints = new int[]{
                    ((Trojkat) f).getX(),
                    ((Trojkat) f).getX1(),
                    ((Trojkat) f).getX2()};
                    
                    int[] yPoints = new int[]{
                    ((Trojkat) f).getY(),
                    ((Trojkat) f).getY1(),
                    ((Trojkat) f).getY2()};
                    
                    g.fillPolygon(xPoints, yPoints, 3);
                }
            }
        }
    }
}
