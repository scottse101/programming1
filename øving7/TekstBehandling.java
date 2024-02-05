import java.util.ArrayList;
import java.util.Arrays;

public class TekstBehandling {
    final String tekst;
    ArrayList<Character> alfabet = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z', 'æ', 'ø', 'å', ' '));
    public TekstBehandling (String tekst) { 
        this.tekst = tekst;
    }

    public int antallOrd(){ //METODE FOR ANTALLORD
        String[] tekstArray = tekst.split(" ");
        return tekstArray.length;
    }

    public double gsoLengde() {  //METODE FOR GJENNOMSNITTLIG ORDLENGDE
        String nyTekst = tekst.toLowerCase();
        char[] charArray = nyTekst.toCharArray();
        for (int i = 0; i < charArray.length; i++) { //starter fra 0 og teller oppover
            if (!(alfabet.contains(charArray[i]))) { 
            nyTekst = nyTekst.replace(Character.toString(charArray[i]), "");
            }
        }
        String temp[] = nyTekst.split(" ");

        double totlengde = 0;
        for (int i = 0; i < temp.length; i++){
            totlengde += temp[i].length();
        }
       return (double) totlengde / temp.length;
        }

    public double ordprPeriode() {   //METODE FOR GJENNOMSNITTLIG ANTALL ORD PER PERIODE 
        String [] periode = tekst.split("[.!:?]");
        double antallSetninger = periode.length;
        return antallOrd() / antallSetninger;
    }
    
    String skiftUt(String ord1, String ord2) { //METODE FOR ERSTATTING AV ORD
        String tekst = this.tekst;
        String nyTekst = tekst.replaceAll(ord1, ord2);
        return nyTekst;
    }

    public String upperCase () { //TEKST I STORE BOKSTAVER
        return tekst.toUpperCase();
    }

}