public class Oppgave3 {
    public static void main(String[] args) {
        double[][] d = {{1, 2, 3}, {4, 5, 6}, {9, 1, 3}};
        Matrise D = new Matrise(d);
        double[][] p = {{5, 1, 2}, {4, 5, 6}, {9, 1, 3}};
        D.addere(p);
        System.out.println((Matrise.getResult()));
        D.multiplisere(p);
        System.out.println((Matrise.getResult()));
        D.transponere();
        System.out.println((Matrise.getResult()));
    }
}

