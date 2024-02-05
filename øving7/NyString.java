public final class NyString { //klassen NyString
    private final String tekst; 

    public NyString (String tekst) { //NyString som konstruktør og string som argument
        this.tekst = tekst;
    }

    public String forkorting(){ //metoden forkorting returnerer første bokstav i hvert ord
        String[] tekstArray = tekst.split(" "); //mellomrom som skiller ordene i teksten
        String forsteBokstav = ""; 
        for (String temp: tekstArray){
            forsteBokstav += temp.charAt(0);
        }
        return forsteBokstav; 
    }

    public String fjerning(char bokstav) {
        char[] tempArray = tekst.toCharArray();
        char[] returnArray = new char[tempArray.length];  //Metoden fjerning går gjennom hver bokstav/symbol og sjekker opp mot "det" du vil fjerne.
        int i = 0;
        while (i < tempArray.length) {
            if (tempArray[i] != bokstav){
                returnArray[i] = tempArray[i];
            }
            i++;
        } 
        String tempString = new String(returnArray);
        return tempString;
    }
    
    public static void main (String[] args) {
        NyString tekst = new NyString("hei? hallo. hva skjer? hade.");
        System.out.println(tekst.tekst);
        System.out.println(tekst.forkorting());
        System.out.println(tekst.fjerning('h'));
    }
}

