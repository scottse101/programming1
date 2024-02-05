public class Intervall {
    public static void main (String[] args) {
        MinRandom tall = new MinRandom();

        testSuksess(tall, 1, 7);
        
    }

    private static void testSuksess(MinRandom tall, int nedre, int øvre){
        int numSuksDouble = 0;
        int numSuksInt = 0;

        for (int j = 0; j < 10000; j++){ //gjør det samme som for Heltall, men bytter ut "i" med "j".
            double testTall1 = tall.nesteDesimaltall(nedre, øvre);
            int testTall = tall.nesteHeltall(1, 7);
            if (testTall1 < nedre || testTall1 > øvre){
                System.out.println("Error");
                break;
            } else {
                numSuksDouble++;
            }

            if (testTall < 1 || testTall > 7){ // "||" betyr "eller" dvs. testTall under 1 eller testTall over 7, men IKKE tilogmed!
                System.out.println("Error");
                break;
            } else {
                numSuksInt++;
            }
        }

        System.out.println(numSuksDouble + "/" + 10000);

    }

}
