public class ArbTaker {
    private Person person;
    private int workernumber;
    private int yearofemployment;
    private int monthsalary;
    private int taxpercent; 

    /**
     * Constructor for ArbTaker
     * @param person Person(FirstName, LastName, BirthYear)
     * @param workernumber WorkerNumber
     * @param yearofemployment YearOfEmployment
     * @param monthsalary MonthlySalary
     * @param taxpercent TaxPercent
     */
    public ArbTaker(Person person, int workernumber, int yearofemployment, int monthsalary, int taxpercent) { 
        this.person = person;
        this.workernumber = workernumber;
        this.yearofemployment = yearofemployment;
        this.monthsalary = monthsalary;
        this.taxpercent = taxpercent;
    }
/**
 * Get-Method for Person (FirstName, LastName, BirthYear)
 * @return this.person
 */
    public Person getPerson() {
        return this.person;
    }
/**
 * Get-Method for WorkerNumber
 * @return this.workernumber
 */
    public int getWorkerNumber () {
        return this.workernumber;
    }
/**
 * Get-Method for YearOfEmployment
 * @return this.yearofemployment
 */
    public int getYearOfEmployment() {
        return this.yearofemployment;
    }
/**
 * Get-Method for MonthlySalary
 * @return this.monthsalary
 */
    public int getMonthSalary() {
        return this.monthsalary;
    }
/**
 * Get-Method for TaxPercent
 * @return this.taxpercent
 */
    public int getTaxPercent() {
        return this.taxpercent;
    }
/**
 * Method for new value for MonthSalary
 * @param a
 */
    public void setMonthSalary (int a) {
        this.monthsalary = a;
    } 
/**
 * Method for new value for taxpercent
 * @param b
 */
    public void setTaxPercent (int b) {
        this.taxpercent = b;
    }
/**
 * Method to find monthly tax
 * @return taxmonth
 */
    public double taxmonth() {
        return this.monthsalary/100*this.taxpercent; //månedlig skatt er månedslønn/delt på 100 * skatteprosent
    }

/**
* Method to find yearly salary
* @return yearly salary
*/
    public double yearsalary() { 
        return this.monthsalary * 12; 
    }
/**
 * Method to find yearly tax
 * @return tax
 */
    public double yeartax() {
        int tax = 0;
        for (int i = 0; i < 10; i++){ //tanken er at man skatter 10 og en halv måned ettersom HELE juni og HALVE desember er skattefri!
            tax += taxmonth();
        }
        return tax + taxmonth()/2;
    }
/**
 * Method for fullname (LastName, FirstName)
 * @return fullname (LastName, FirstName)
 */
    public String fullName() { 
        return person.getLastName() + "," + person.getFirstName(); //Personens navn kommer ut i "Etternavn, Fornavn"
    }
/**
 * Method for age (of person) (år - person.BirthYear)
 * @return age
 */
    public int age() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar(); //nåværende kalender hentet fra oppgavebeskrivelsen
        return kalender.get(java.util.Calendar.YEAR) - this.person.getBirthYear(); 
        //regne ut alder til arbtaker, år - fødselsåret til personen = alder
    }
/**
 * Method for yearInEmployment (år - getYearOfEmployment)
 * @return yearInEmployment
 */
    public int yearInEmployment() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int år = kalender.get(java.util.Calendar.YEAR);

        return år - getYearOfEmployment();
    }
/**
 * Method for personEmployed longer than "int-number" => true, if not => false
 * @param number
 * @return true or false
 */
    public boolean personEmployed (int number) {  
        return number < yearInEmployment();
        
    } 

}
