package hu.szamalk.model;

public class MertaniHenger {
    private static int hengerDarab = 0;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }


    public double terfogat(){
        return (sugar*sugar)*Math.PI*magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar = " + sugar +
                ", magassag = " + magassag +
                '}';
    }

    //VESZÉLYES és nehéz használni
    protected static void csokkentHengerDarab() {
        MertaniHenger.hengerDarab--;
    }
}
