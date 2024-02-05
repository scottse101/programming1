public class TestBrøk {

    public static void main (String [] args) {
        Brøk nyBrøk = new Brøk(1, 3); //legger inn brøk 1 med tilfeldig teller og nevner
        nyBrøk.sumBrøk(2, 6); //legger inn brøk 2
        System.out.println("Addisjon");
        System.out.println(nyBrøk.toString());
        System.out.println("Telleren blir: " + nyBrøk.getTeller()); //bruker getmetoden og henter ut "teller" fra Brøk-classen
        System.out.println("Nevneren blir: " + nyBrøk.getNevner()); //gjør det samme med "nevner"
        System.out.println("");

        Brøk nyBrøk2 = new Brøk(1, 3); 
        nyBrøk2.subBrøk(2, 6);
        System.out.println("Subtraksjon");                       //utfører det samme for subtraksjon
        System.out.println("Telleren blir: " + nyBrøk2.getTeller());
        System.out.println("Nevneren blir: " + nyBrøk2.getNevner());
        System.out.println("");

        Brøk nyBrøk3 = new Brøk(1, 3);
        nyBrøk3.mulBrøk(2, 6);
        System.out.println("Multiplikasjon");                    //utfører det samme for multiplikasjon
        System.out.println("Telleren blir: " + nyBrøk3.getTeller());
        System.out.println("Nevneren blir: " + nyBrøk3.getNevner());
        System.out.println("");

        Brøk nyBrøk4 = new Brøk(1, 3);
        nyBrøk4.divBrøk(2, 6);
        System.out.println("Divisjon");                          //utfører det samme for divisjon
        System.out.println("Telleren blir: " + nyBrøk4.getTeller());
        System.out.println("Nevneren blir: " + nyBrøk4.getNevner());
    }

}