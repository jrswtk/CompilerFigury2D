package parser;

public class TWarunek {

    TWyrazenie wyrazenieLewe = null;
    TWyrazenie wyrazeniePrawe = null;
    String relacja = null;

    public TWarunek(String relacja, TWyrazenie wyrazenieLewe, TWyrazenie wyrazeniePrawe) {
        this.relacja = relacja;
        this.wyrazenieLewe = wyrazenieLewe;
        this.wyrazeniePrawe = wyrazeniePrawe;
    }

    public boolean wykonaj() {
        int wartoscLewa = (Integer) wyrazenieLewe.wykonaj();
        int wartoscPrawa = (Integer) wyrazeniePrawe.wykonaj();

        if (relacja.equalsIgnoreCase("ROWNE")) {
            return (wartoscLewa == wartoscPrawa);
        } else if (relacja.equalsIgnoreCase("NIEROWNE")) {
            return (wartoscLewa != wartoscPrawa);
        } else if (relacja.equalsIgnoreCase("WIEKSZE")) {
            return (wartoscLewa > wartoscPrawa);
        } else if (relacja.equalsIgnoreCase("MNIEJSZE")) {
            return (wartoscLewa < wartoscPrawa);
        } else {
            throw new Error("Nieoczekiwana relacja " + relacja);
        }
    }
}
