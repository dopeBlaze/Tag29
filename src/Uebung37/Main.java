package Uebung37;

public class Main {
    public static void main(String[] args) {

        String text = "Hallo Welt 1234 !";

        zeichenLoeschen(text);

        text = "Dieser Text wird geprueft.";
        zeichenFolgeSplitten(text);

    }
    /*
    1.	Schreiben Sie einen Regex, der eine beliebig lange Zahlenfolge in einem Text finden kann.
    \d+

    2.	Schreiben Sie einen Regex, der ein Wort aus einer beliebig langen Zeichenfolge in einem Text finden kann.
    liebig\w

    3.	Schreiben Sie einen Regex, der ein Wort aus 4-10 Buchstaben in einem Text finden kann.
    Das Wort darf dabei nur aus den Buchstaben a-z, sowie A-Z bestehen.
    ([a-zA-Z]){4,10}\w+
     */


    /*
    4.	Schreiben Sie eine Funktion, die in einem übergebenem Text alle Zeichen löscht, die kein Buchstabe und keine Ziffer sind.
     */
    public static void zeichenLoeschen(String text){

        System.out.println(text);
        String regex = "\\W";

        System.out.println(text.replaceAll(regex, ""));
    }

    /*
    5.	Schreiben Sie eine Funktion, die eine übergebene Zeichenfolgen beim Vorkommen eines „p“ splittet.
     */
    public static void zeichenFolgeSplitten(String text){

        System.out.println(text);
        String regex = "[p]";

        String[] arrOfStr = text.split(regex);

        for (String a : arrOfStr)
            System.out.println(a);
    }

    /*
    Zusatzaufgaben
    6.	Schreiben Sie einen regulären Ausdruck der alle europäischen Postleitzahlen auf Gültigkeit prüfen kann
    (\d{4}-\d{3})|([A-Z]{2}-\d{4})|([A-Z]{2}\d[A-Z]\s\d[A-Z]{2})|([A-Z]\d{2}\s[A-Z]\d[A-Z]\d)|([A-Z]{2}\d{4})|(\d{4}\s[A-Z]{2})|(\d{2}-\d{3})|(\d{3}\s\d{2})|(\d{5})|(\d{4})

    7.	Schreiben Sie einen regulären Ausdruck, der eMail-Adressen auf Gültigkeit prüfen kann
    (\w+[@]\w+[.]\w+)|(\w+[.]\w+[@]\w+[.]\w+)
     */
}
