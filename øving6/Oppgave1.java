public class Oppgave1 {

    public static void main (String[] args) {
        java.util.Random random = new java.util.Random(); 
        int[] antall = new int[10];

        for (int i = 0; i <= 1000; i++){
            int tall = random.nextInt(10);
            antall[tall] += 1;
        }

        for (int number : antall){ // ":" funksjon som går gjennom hele tabellen, for hvert punkt fra 0-9 og printer ut verdien.
            System.out.println(number);
        }
        
    }

}