public class Klient {
    
    public static void main(String[] args) {
        Person person1 = new Person(" Andre", "Kristiansen", 2002); 
        ArbTaker arbTaker1 = new ArbTaker(person1, 37, 2007, 50000, 31); 

        System.out.println(arbTaker1.fullName());
        System.out.println(arbTaker1.age() + " år gammel ");
        System.out.println(arbTaker1.getMonthSalary() + " kroner i måneden ");
        System.out.println(arbTaker1.yearsalary() + " kroner i året");
        System.out.println(arbTaker1.taxmonth() + " kroner i månedlig skatt");
        System.out.println(arbTaker1.getTaxPercent() + " %" + " er skatteprosenten ");
        System.out.println(arbTaker1.yeartax() + " kroner i årlig skatt");
        System.out.println(arbTaker1.getWorkerNumber() + " er arbeidernummer ");
        System.out.println(arbTaker1.getYearOfEmployment() + " året du ble ansatt ");
        System.out.println(arbTaker1.personEmployed(54)); //total år ansatt i bedriften lenger/kortere enn (input: 54)?

        // System.out.println(person1.toString()); (ToString = IntelliJ !)
    }
    
}
