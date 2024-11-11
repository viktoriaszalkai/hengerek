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
        return 0.0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
