public class TestKlient { 
    
public static void main (String[] args) {
    TekstBehandling tekst = new TekstBehandling ("Bæ bæ lille lam, har du noe ull? Ja, ja, kjære barn, jeg har kroppen full. Søndagsklær til far, og søndagsklær til mor, og to par strømper til bitte lille bror."); 
    System.out.println(tekst.antallOrd() + " antall ord i teksten");
    System.out.println("");

    System.out.println(tekst.gsoLengde() + " er den gjennomsnittlige ordlengden"); 
    System.out.println("");

    System.out.println(tekst.ordprPeriode() + " er den gjennomsnittlig antall ord per periode"); 
    System.out.println("");

    System.out.println("Erstatter ordet har med hadde "); 
    System.out.println(tekst.skiftUt(" har ", " hadde ")); //bytter ut ord1 = har med ord2 = hadde.
    System.out.println("");

    System.out.println(tekst.upperCase()); //Tekst i store bokstaver
    System.out.println("");
    
    System.out.println(tekst.tekst); //Original tekst
    }

}