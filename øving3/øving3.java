import java.util.Scanner;

public class øving3 {
    public static void main (String[] args) { 
        System.out.println("Skriv inn tall 1"); //skriver inn tall 1 for å få "tall 1 x 1-10"
        try (Scanner scanner = new Scanner (System.in)) {
            int tall1 = scanner.nextInt();

            System.out.println("Skriv inn tall 2");
            int tall2 = scanner.nextInt();

        for (int t = tall1; t <= tall2; t +=1) { //bestemmer at tall 1 (t) er mindre eller lik tall 2 samtidig som at tall 1 øker med +1 
                System.out.println(t+" gangen: ");
            for (int s = 1; s < 11; s++) { //bestemmer s er alle tall mindre enn 11 siden jeg ønsker å hente ut tall fra 1-10
                    System.out.println(s + " x " + t + " = " + s * t); //printer ut hvordan hver rad skal se ut fra input tall multiplisert med 1-10 i gangetabellen
                } 
            }
        }
    } 
}
