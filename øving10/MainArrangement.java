import java.util.Scanner;

/**
 * Klient for ArrangementRegister
 */
public class MainArrangement {

    public static void main(String[] args) {
        ArrangementRegister arrangement = new ArrangementRegister();
        arrangement.addArrangement(new Arrangement("Festningen", 1, "Trondheim","Festningen AS","Festival",202211031500L));
        arrangement.addArrangement(new Arrangement("Sirkus", 2, "Levanger", "Sirkus AS", "Byen",202205061800L));
        arrangement.addArrangement(new Arrangement("Alkohol", 3, "Elverum", "Alkohol AS", "Fest",202312091700L));

        int newArrangementNumber, userInputNumber;
        String newArrangementName, newArrangementPlace, newArrangementOrganizer, newArrangementType;
        long newFirstDate, newSecondDate, newArrangementTime;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Tast 1 for å registrere et nytt arrangement");
                System.out.println("Tast 2 for å finne alle arrangementer på en gitt dato.");
                System.out.println("Tast 3 for å vise arrangementer mellom to datoer");
                System.out.println("Tast 4 for å vise alle arrangementer sortert på tid.");
                System.out.println("Tast 5 for å vise alle arrangementer sortert på sted.");
                System.out.println("Tast 6 for å vise alle arrangementer sortert på type.");
                System.out.println("Tast 7 for å skrive ut en liste over alle arrangementer");
                userInputNumber = scanner.nextInt();
                System.out.println();

                switch (userInputNumber) {
                    case 1: //registrerer et nytt arrangement
                        System.out.println("Vennligst registrer arrangementnavn");
                        scanner.nextLine();
                        newArrangementName = scanner.nextLine();

                        System.out.println("Vennligst registrer arrangementnummer");
                        newArrangementNumber = scanner.nextInt();

                        System.out.println("Vennligst registrer arrangementsted");
                        scanner.nextLine();
                        newArrangementPlace = scanner.nextLine();

                        System.out.println("Vennligst registrer arrangementorganisasjon");
                        newArrangementOrganizer = scanner.nextLine();

                        System.out.println("Vennligst registrer arrangementtype");
                        newArrangementType = scanner.nextLine();

                        System.out.println("Vennligst registrer arrangementdato, på formatet (YYYYMMDDTTTT).");
                        newArrangementTime = scanner.nextLong();

                        arrangement.addArrangement(new Arrangement(newArrangementName, newArrangementNumber, newArrangementPlace, newArrangementOrganizer, newArrangementType, newArrangementTime));
                        break;

                    case 2:
                        System.out.println("Hvilken dato vil du sjekke arrangementer for?");
                        newArrangementTime = scanner.nextLong();
                        System.out.println(arrangement.getArrangementsAtDate(newArrangementTime));
                        break;

                    case 3:
                        System.out.println("Skriv inn første datoen på arrangementet, på formatet (YYYYMMDD).");
                        newFirstDate = scanner.nextLong();
                        System.out.println("Skriv inn andre datoen på arrangementet, på formatet (YYYYMMDD).");
                        newSecondDate = scanner.nextLong();

                    case 4:
                        for (Arrangement arrangement1 : arrangement.sortArrangementByTime()) {
                            System.out.println(arrangement1);
                        }
                        break;

                    case 5:
                        for (Arrangement arrangement1 : arrangement.sortArrangementByPlace()) {
                            System.out.println(arrangement1);
                        }
                        break;

                    case 6:
                        for (Arrangement arrangement1 : arrangement.sortArrangementByType()) {
                            System.out.println(arrangement1);
                        }
                        break;

                    case 7:
                        System.out.println(arrangement);
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}