public class øving1 {
    public static void main (String[] args){
        int timer=2; //definerer antall timer
        int minutter=48; // definerer antall minutter
        int sekunder=7; //definerer antall sekunder 
        int totalsek=timer*3600+minutter*60+sekunder; //multipliserer antall timer med 3600 og antall minutter med 60 for å få omgjort til sekunder.

        System.out.println(totalsek+"sekunder"); //henter ut totalsummen av sekunder
        }
    }
