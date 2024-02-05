import java.util.Random;

public class MinRandom {
    Random tilfeldig = new Random();   
    

    public int nesteHeltall(int nedre, int øvre) { //metode #1 for heltall
        int diff = (øvre+1) - nedre;
        return (tilfeldig.nextInt(diff) + nedre);
    }

    public double nesteDesimaltall(double nedre, double øvre) {  //metode #2 for desimaltall
        double diff = (øvre+1) - nedre;
        return tilfeldig.nextDouble(diff);
    }
}