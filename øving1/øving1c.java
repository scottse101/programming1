public class øving1c {
public static void main (String[] args){
int totalesekunder=10087; //bruker øving1 som utgangspunkt og definerer det som totalsekunder
int totaletimer= totalesekunder/3600; //dividerer på 3600 for å finne totaletimer
int minutter=(totalesekunder-totaletimer*3600)/60; //finner antall minutter ved å fjerne totaletimer
int sekunder= totalesekunder-totaletimer*3600-minutter*60; //finner tilslutt antall sekunder ved å fjerne antall timer og minutter
System.out.println(totaletimer+"timer"+minutter+"minutter"+sekunder+"sekunder"); //printer ut antall timer, minutter og sekunder av tot.sek.

}
}
