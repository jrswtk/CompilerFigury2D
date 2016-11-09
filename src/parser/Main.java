package parser;

/*
 * To jest klasa demonstrujaca tworzenie translatora dla wyrazen typu: 2+3-3+4
 * z uzyciem klas typow zwracanych przez symbole nieterminalne,
 * ze zmiennymi typu calkowitego oraz z instrukcjami warunkowymi i petla WHILE
 */
import figury.Okno2D;
import java.io.FileReader;

public class Main {

    static public void main(String[] args) throws java.io.IOException {

        String tekstPlik = args[0];
        parser parser_obj = new parser(new MyLexer(new FileReader(tekstPlik)));

        try {
            TProgram result = (TProgram) parser_obj.parse().value;
            result.wykonaj();

            Okno2D okno2D = new Okno2D();
            okno2D.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tekst wyjatku po parsowaniu: " + e.getMessage());
            System.exit(0);
        }

    }

}
