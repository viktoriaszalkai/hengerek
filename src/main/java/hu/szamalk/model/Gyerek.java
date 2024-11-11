package hu.szamalk.model;

public class Gyerek extends Szulo{
    private String vezetekNev,keresztNev;
    private int kor;
    private boolean jatek;


    public Gyerek(String vezetekNev,String keresztNev, int kor) {
        this(vezetekNev,keresztNev,kor, true);
    }

    public Gyerek(String vezetekNev, String keresztNev,int kor, boolean jatek ) {
        super(vezetekNev);
        this.keresztNev = keresztNev;
        this.jatek = jatek;
        this.kor = kor;
    }
}
