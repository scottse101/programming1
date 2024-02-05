import java.util.Scanner;
public class AntallDager{
    public static void main(String[] args) {
        int[] dager = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Er det skuddår? Skriv 1 for ja");
        try{
            int valg = scanner.nextInt();
            if(valg == 1){
                dager[1] = 29;
            }
        }catch (Exception e){
            System.out.println("Vennligst tast inn et gyldig tall");
        }
        scanner.close();
        for (int i = 0; i < dager.length; i++){
            System.out.println(dager[i]);
        }
    }
}
