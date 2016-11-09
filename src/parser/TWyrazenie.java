package parser;

public class TWyrazenie {

    String operator = null;
    TWyrazenie wyrazenie = null;
    TSkladnik skladnik = null;
    String string;

    public TWyrazenie(TSkladnik skladnik) {
        this.skladnik = skladnik;
    }

    public TWyrazenie(String op, TWyrazenie wyrazenie, TSkladnik skladnik) {
        this.operator = op;
        this.wyrazenie = wyrazenie;
        this.skladnik = skladnik;
    }

    public TSkladnik getSkladnik() {
        return skladnik;
    }

    public Object wykonaj() {
        if (operator != null) {
            if (operator.equalsIgnoreCase("PLUS")) {
                return (Integer) wyrazenie.wykonaj() 
                        + (Integer) skladnik.wykonaj();
            } else if(operator.equalsIgnoreCase("MINUS")) {
                return (Integer) wyrazenie.wykonaj() 
                        - (Integer) skladnik.wykonaj();
            } else {
                throw new Error("Nieoczekiwany operator <" 
                        + operator + ">");
            }
        }
        if (skladnik.isIsString()) {
            return skladnik.getString();
        }
        return skladnik.wykonaj();

    }

    public boolean isString() {
        return skladnik.isIsString();
    }

    public String wykonajString() {
        if (skladnik != null) {
            return skladnik.getString();
        }

        return "";
    }
}
