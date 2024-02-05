/**
 * Klient for MenyRegister
 */
public class MainMeny {

    public static void main (String[] args) {
        MenyRegister register = new MenyRegister();

        register.addRett(new Rett("Japansk forrett", "Japansk", 120));
        register.addRett(new Rett("Japansk middag", "Japansk", 170));
        register.addRett(new Rett("Japansk dessert", "Japansk", 200));
        register.addRett(new Rett("Fransk dessert", "Fransk", 110));
        register.addRett(new Rett("Fransk middag", "Fransk", 180));
        register.addRett(new Rett("Fransk forrett", "Fransk", 80));

        register.addMeny(new Meny("Japansk", register.getRetterAvType("Japansk")));
        register.addMeny(new Meny("Fransk", register.getRetterAvType("Fransk")));

        //Tester ut metoder
        System.out.println(register.getRettAvNavn("Japansk forrett"));
        System.out.println();
        System.out.println(register.getRetterAvType("Fransk"));
        System.out.println();
        System.out.println(register.getMenyerMellomPriser(400,500));
    }
}
