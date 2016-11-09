package parser;

public class TBlok {

    TSekwencjaInstrukcji sekwencjaInstrukcji = null;

    public TBlok(TSekwencjaInstrukcji sekwencjaInstrukcji) {
        this.sekwencjaInstrukcji = sekwencjaInstrukcji;
    }

    public void wykonaj() {
        sekwencjaInstrukcji.wykonaj();
    }

}
