import java.util.Scanner;

public class PriceCaluclation {
    
    public static void main (String[] args) {
        Groceries shop1 = new Groceries();
        Scanner input = new Scanner (System.in);

        System.out.println(" Skriv inn antall kilogram på varene"); 
        double vektVar = input.nextDouble();

        System.out.println("Skriv inn pris på varer i kroner"); 
        double prisVar = input.nextDouble();

        System.out.println("Kjøper " + vektVar + "kg varer for " + prisVar + " kr.");
        System.out.println("Legger til avslag m/moms, ny pris er: " + prisVar * shop1.medMoms(vektVar) + " kr.");

        input.close();
        }

    }


