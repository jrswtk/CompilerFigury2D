package parser;

public class TSekwencjaInstrukcji {

    TInstrukcja instrukcja = null;
    TSekwencjaInstrukcji sekwencjaInstrukcji = null;

    public TSekwencjaInstrukcji(TInstrukcja instrukcja) {
        this.instrukcja = instrukcja;
    }

    public TSekwencjaInstrukcji(TSekwencjaInstrukcji sekwencjaInstrukcji, 
            TInstrukcja instrukcja) {
        
        this.sekwencjaInstrukcji = sekwencjaInstrukcji;
        this.instrukcja = instrukcja;
    }

    public void wykonaj() {
        if (sekwencjaInstrukcji != null) {
            sekwencjaInstrukcji.wykonaj();
        }

        instrukcja.wykonaj();
    }
}
