package hu.szamalk.model;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly(){
        return this.terfogat()*fajsuly;  //super() nem jó!, terfogat() ugyan az mint a this.terfogat()
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " --> TomorHenger{" +
                "fajsuly = " + fajsuly +
                '}';
    }
}
