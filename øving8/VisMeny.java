import java.util.Scanner; //importerer scanner

public class VisMeny {
    public static void main (String[] args){
        Person person1 = new Person(" Andre", "Kristiansen", 2002); //
        ArbTaker arbTaker1 = new ArbTaker(person1, 37, 2007, 35000, 20);

        Scanner scanner1 = new Scanner (System.in); //Lager et scanner-objekt

        while (true) { //lagd en while loop som sender programmet tilbake til start etter å ha skrevet en tilfeldig input 1-3
        System.out.println("Press 1 to change the monthly salary");
        System.out.println("Press 2 to change the tax percent");
        System.out.println("Press 3 to print out all data");
        int menyInput = scanner1.nextInt();
            
        if (menyInput == 1) {
        System.out.println("Type the new monthly salary");
        int menyInput2 = scanner1.nextInt();

        arbTaker1.setMonthSalary(menyInput2);
        System.out.println(" New monthly salary is " + arbTaker1.getMonthSalary() + " kroner ");

        } else if (menyInput == 2) {
        System.out.println(" Type the new tax percent");
        int menyInput2 = scanner1.nextInt();
        
        arbTaker1.setTaxPercent(menyInput2);
        System.out.println(" New tax percent is " + arbTaker1.getTaxPercent() + "% ");

        } else {
        System.out.println(arbTaker1.fullName());
        System.out.println(arbTaker1.age() + " år gammel ");
        System.out.println(arbTaker1.getMonthSalary() + " kroner i måneden ");
        System.out.println(arbTaker1.yearsalary() + " kroner i året");
        System.out.println(arbTaker1.taxmonth() + " kroner i månedlig skatt");
        System.out.println(arbTaker1.getTaxPercent() + " %" + " er skatteprosenten ");
        System.out.println(arbTaker1.yeartax() + " kroner i årlig skatt");
        System.out.println(arbTaker1.getWorkerNumber() + " er arbeidernummer ");
        System.out.println(arbTaker1.getYearOfEmployment() + " året du ble ansatt ");
        }
        }

    }

}
