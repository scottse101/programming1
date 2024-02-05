import java.util.Scanner;

public class TestKlient1 {
  
    public static void main(String[] args) {
        OppgaveOversikt oversikt = new OppgaveOversikt();
        Scanner scanner = new Scanner(System.in);

        while (true){
            try{
                System.out.println("Tast 1 for å sjekke alle studenter.");
                System.out.println("Tast 2 for antall oppgaver en student har gjort.");
                System.out.println("Tast 3 for å øke antall oppgaver for en student.");
                System.out.println("Tast 4 for å registrere en ny student.");
                int choice = scanner.nextInt();
                scanner.nextLine();

                    switch (choice) {
                        case 1:
                            if(oversikt.getAntStudReg() < 1) {
                                System.out.println("Ingen studenter å vise, registrer noen.");
                            } else if (oversikt.getAntStudReg() >= 1){
                                System.out.println(oversikt.toString());
                                System.out.println("Antall studenter: " + oversikt.getAntStudReg());
                            }
                        break;

                        case 2:
                            System.out.println("Skriv inn student: ");
                            String navn = scanner.nextLine();
                            System.out.println(oversikt.getAntOppgStud(navn));
                        break;

                        case 3:
                            System.out.println("Hvilken student?");
                            String navn2 = scanner.nextLine();
                            System.out.println("Hvor mange oppgaver?");
                            int økning = scanner.nextInt();
                            oversikt.setØkAntOppgStud(navn2, økning);
                        break;

                        case 4:
                            System.out.println("Skriv inn ny navn til student:");
                            String navn3 = scanner.nextLine();
                            System.out.println("Skriv inn antall oppgaver de har løst");
                            int antOppg = scanner.nextInt();
                            oversikt.regNyStud(navn3, antOppg);
                        break;
                    }}
                    
                    catch (Exception e) {
                        System.out.println("Ikke gjør noe dumt, følg instruksene." + e);
                    }
            }
        }
    }



