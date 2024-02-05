public class Brøk { //klassen Brøk
    private int teller;
    private int nevner;

    public Brøk(int tellerIn, int nevnerIn) throws IllegalArgumentException{ //konstruktør #1
        if (nevnerIn == 0) {
            throw new IllegalArgumentException ("NB! kan ikke deles på null.");
        } 
        this.teller = tellerIn; //this. brukes for å referere til denne spesifikke konstruktøren
        this.nevner = nevnerIn;
    }

    public Brøk(int teller) { //konstruktør #2
      /*   this.teller = teller;
        this.nevner = 1; */

        this(teller, 1);

    }
    
    //bruker void for at denne spesifikke metoden skal IKKE returneres!
    public void sumBrøk(int tellerIn, int nevnerIn){ //metode #1 for å summere
        tellerIn *= nevner;
        teller *= nevnerIn;
        nevner *= nevnerIn;
        teller += tellerIn;
    }

    //bruker void for at denne spesifikke metoden skal IKKE returneres!
    public void subBrøk(int tellerIn, int nevnerIn){ //metode #2 for å subtrahere
        tellerIn *= nevner;
        teller *= nevnerIn;
        nevner *= nevnerIn;
        teller -= tellerIn;
    }

    //bruker void for at denne spesifikke metoden skal IKKE returneres!
    public void mulBrøk(int tellerIn, int nevnerIn){ //metode #3 for å multiplisere
        teller *= tellerIn;
        nevner *= nevnerIn;
    }

    //bruker void for at denne spesifikke metoden skal IKKE returneres!
    public void divBrøk(int tellerIn, int nevnerIn){ //metode #4 for å dividere
        teller *= nevnerIn;
        nevner *= tellerIn;
    }
    
    public int getTeller() {
        return teller; //returnerer objektet teller
    }
    
    public int getNevner() {
        return nevner; //returnerer objektet nevner
    }

    @Override
    public String toString() {
        return "Denne brøken er : " + this.teller + "/" + this.nevner;
    }

}

