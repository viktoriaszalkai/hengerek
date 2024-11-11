package hu.szamalk.model;

import hu.szamalk.HengerProgram;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1,falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
//        double atmero = 2* getSugar();
//        return Math.PI*((Math.pow(Math.pow(atmero,2)-atmero-2*getFalvastagsag(),2))/4)*getMagassag();
        double kulsoV = super.terfogat();
        double belsoR = getSugar()-falvastagsag;
        MertaniHenger belsoH = new MertaniHenger(belsoR,getMagassag());
        double belsoV = belsoH.terfogat();

        MertaniHenger.csokkentHengerDarab();
        return kulsoV - belsoV;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " --> LyukasHenger{" +
                "falvastagsag = " + falvastagsag +
                '}';
    }


}
