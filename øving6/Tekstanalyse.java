import java.util.ArrayList;
import java.util.Arrays;

public class Tekstanalyse {
    static int[] antallTegn = new int[30];
    ArrayList<String> alfabet = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "x", "y", "z", "æ", "ø", "å"));

    Tekstanalyse(String tekst){
        tekst = tekst.toLowerCase();
        for (int i = 0; i < tekst.length(); i++){
            String symbol = Character.toString(tekst.charAt(i));
            if (alfabet.contains(symbol)){
                int indeks = alfabet.indexOf(symbol);
                antallTegn[indeks] += 1;
            } else {
                antallTegn[29] += 1;
            }
        }
    
    }
        public int antallBoks() {
            int counter = 0;
        for (int i = 0; i < antallTegn.length - 1; i++){
            if (antallTegn[i] > 0){
                counter ++;
        } 
    } 
        return counter;
    
    }

    public int totalBoks() {
        int counter = 0;
        for (int number : antallTegn){
            counter += number;
        } 
    counter -= antallTegn[29];
        return counter;
    }

    public double proSymb() {
        return (antallTegn[29] / (totalBoks() + antallTegn[29])) * 100;
    }

    public int bestemtBoks(String bokstav) {
        if (alfabet.contains(bokstav)) {
            int indeks = alfabet.indexOf(bokstav);
            return antallTegn[indeks]; 
        } else {
            return antallTegn[29];
            }
    }

    public String bokstavFlest() {
        int høyest = -1;
        String høyestBokstav = "";
        for (int i = 0; i < 29; i++) {
            if (antallTegn[i] > høyest) {
            høyest = antallTegn[i];
            høyestBokstav = alfabet.get(i);
        } else if (antallTegn[i] == høyest) {
            høyestBokstav = høyestBokstav + ", " + alfabet.get(i);
        }
    }
    return "Bokstaven(e) som forekommer oftest er " + høyestBokstav + " = " + høyest + " ganger ";
            
    }
    
}

