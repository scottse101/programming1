class Groceries {
    private double antallRabatt;

    public double medMoms(double vektVar) {
        if (vektVar > 5){
            antallRabatt = 0.8;
            return antallRabatt;

        } else if (vektVar > 3) {
            antallRabatt = 0.9;
            return antallRabatt;
        } else {    
            antallRabatt = 1;
            return antallRabatt;
        }

    }
}
