import java.util.ArrayList;

/**
 * Klassen lager en oversikt over studentene
 */
public class OppgaveOversikt {
    private final ArrayList<Student> studenter;


    public OppgaveOversikt() {
    studenter = new ArrayList<Student>();
}

public int getAntStudReg(){
    return studenter.size();
}

public int getAntOppgStud(String navn){
    for (Student student : studenter) {
        if (student.getNavn().equalsIgnoreCase(navn)) {
            return student.getAntOppg();
        }
    }
    throw new IllegalArgumentException("Studenten eksisterer ikke");
}

public void regNyStud(String navn, int antOppg){
    for (Student student : studenter) {
        if(student.getNavn().equalsIgnoreCase(navn)) {
            throw new IllegalArgumentException("Navnet er ikke i bruk");
        }
    }
    studenter.add(new Student (navn, antOppg));
}

public void setØkAntOppgStud(String navn, int økning){
    for(Student student: studenter) {
        if(student.getNavn().equalsIgnoreCase(navn)) {
            student.antØktOppg(økning);
        }
    }
}

@Override
public String toString() {
    String oversiktOverStudenter = "";
    for (Student student : studenter) {
        oversiktOverStudenter += student.getNavn() + ", " + + student.getAntOppg() + " oppgaver" + "\n";
    }
    return oversiktOverStudenter;
}
}
