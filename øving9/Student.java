public class Student {
    private final String navn; //entydig!
    private int antOppg;

    /**
     * Konstruktør for Student
     * @param navn er navn på Student
     * @param antOppg er Antall oppgaver
     */
    public Student (String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntOppg(){
        return antOppg;
    }

    public void antØktOppg(int økning) {
        this.antOppg = antOppg + økning;
    }
}