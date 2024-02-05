public class Oppgave2 {
    
    public static void main(String[] args) {
        Tekstanalyse test1 = new Tekstanalyse("HEI HALLO ZAHID ER GLAD I RUMPER ZAHID ZHAIDFLKSDFLKSDFLSDF...SDFLSDFS,,.SDF, YO");
        for(int i = 0; i < Tekstanalyse.antallTegn.length-1; i++){
            System.out.println(Tekstanalyse.antallTegn[i]);
        }
            System.out.println(test1.bokstavFlest());
    }

}

