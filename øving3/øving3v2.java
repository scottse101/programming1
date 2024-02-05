import java.util.Scanner;

public class øving3v2 {
    public static void main (String[] args) { 

        while (true) {                                     //hvis dette "scope" => linje 11
                Scanner scanner = new Scanner (System.in);
                System.out.println("Skriv et nummer"); 
                    int number = scanner.nextInt();
                    if (number == 0) {
                        System.out.println("Programmet suger."); //hvis input tallet er null kommer dette som output og programmet avsluttes
                        break;
                }

                    boolean check = false; 
                    for (int s = 2; s < number; s++) { //definerer s som 2 og s er alle tall mindre enn input nummeret
                        if (number % s == 0) { //hvis inputtallet er delelig på s med 0 i rest er tallet et primtall
                            check = true;
                            break;
                    }
                }
                    if (!check) //hvis det ikke er lik "check"
                        System.out.println(number + " er et primtall."); //er inputnummeret er primtall
                    else
                        System.out.println(number + " er ikke et primtall"); //ellers er inputnummeret ikke et primtall
                    }   
                    }
                }

    

