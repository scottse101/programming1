import java.util.Scanner;

public class EiendomKlient {
    public static void main(String[] args) {

        EiendomsRegister register = new EiendomsRegister();
        register.addEiendom(new Eiendom(1445, "Gloppen", 77, 631, "", 1071.6, "Jens Olsen"));
        register.addEiendom(new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        register.addEiendom(new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        register.addEiendom(new Eiendom(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        register.addEiendom(new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

        Scanner scanner = new Scanner(System.in);
        int brukerInput, newKommuneNummer, newGaardsNummer, newBruksNummer;
        String newKommuneNavn, newBruksNavn, newEier;
        double newAreal;

        do {
            System.out.println("Hvilke tjenester ønsker du å utføre?");
            System.out.println("Tast 1. Registrere en ny eiendom til eiendomsregisteret.");
            System.out.println("Tast 2. Få en oversikt over alle eiendommene i eiendomsregisteret.");
            System.out.println("Tast 3. Søk etter en eiendom i registeret ved kommunenummer, gårdsnummer og bruksnummer");
            System.out.println("Tast 4. Finn gjennomsnittsarealet av alle eiendommene i eiendomsregisteret");
            System.out.println("Tast 5. For å avslutte programmet");

            brukerInput = scanner.nextInt();

            switch (brukerInput) {

                case 1:
                    System.out.println("Hva er kommunenummeret på eiendommen?");
                    newKommuneNummer = scanner.nextInt();

                    System.out.println("Hva er kommunenavnet på eiendommen?");
                    scanner.nextLine();
                    newKommuneNavn = scanner.nextLine();

                    System.out.println("Hva er gårdsnummeret for eiendommen?");
                    newGaardsNummer = scanner.nextInt();

                    System.out.println("Hva er bruksnummeret for eiendommen?");
                    newBruksNummer = scanner.nextInt();

                    System.out.println("Hva er navnet på eiendommen? Hvis ikke den har navn, la den stå tom");
                    scanner.nextLine();
                    newBruksNavn = scanner.nextLine();

                    System.out.println("Hva er arealet på eiendommen?");
                    newAreal = scanner.nextDouble();

                    System.out.println("Hvem er eier av eiendommen?");
                    scanner.nextLine();
                    newEier = scanner.nextLine();

                    register.addEiendom(new Eiendom(newKommuneNummer, newKommuneNavn, newGaardsNummer, newBruksNummer, newBruksNavn, newAreal, newEier));
                    System.out.println("Eiendommen er lagt til i eiendomsregisteret");
                    break;

                case 2:
                    System.out.println(register);
                    break;

                case 3:
                    System.out.println("Vennligst skriv inn kommunenummer for eiendommen");
                    newKommuneNummer = scanner.nextInt();
                    System.out.println("Vennlist skriv inn gårdsnummeret for eiendommen");
                    newGaardsNummer = scanner.nextInt();
                    System.out.println("Vennligst skriv inn bruksnummeret for eiendommen");
                    newBruksNummer = scanner.nextInt();
                    System.out.println(register.findEiendom(newKommuneNummer, newGaardsNummer, newBruksNummer));
                    break;

                case 4:
                    System.out.println(register.getGjennomsnittAreal());
                    break;

                default:
                    break;

            }
        } while (brukerInput != 5);
        scanner.close();
    }


}
