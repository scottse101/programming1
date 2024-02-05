import static javax.swing.JOptionPane.*; 
public class øving2oppg1{

    public static void main (String[] args){
    
        String readyear = showInputDialog("Enter year"); //Skriver inn ønsket år "Enter ye"
        int year = Integer.parseInt(readyear);

        if (year % 100 == 0) {  //Deler året på 100 med null i rest
        
            if (year % 400 == 0) {  
              System.out.println("Året er et skuddår"); //Hvis året er delelig 400 med null i rest = skuddår
        }
    }   else if (year % 4 == 0) {
        System.out.println("Året er et skuddår"); //Ellers hvis året er delelig med 4 med null i rest = skuddår
    }   else {
        System.out.println("Året er ikke et skuddår"); //Hvis året ikke er delelig med inputen beskrevet ovenfor er det ikke et skuddår
    }
}
}

