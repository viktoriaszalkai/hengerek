package hu.szamalk;

import hu.szamalk.model.LyukasHenger;
import hu.szamalk.model.MertaniHenger;
import hu.szamalk.model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public void run(){
        System.out.printf("A felhasznált hengerek (%d db):\n", db);
        MertaniHenger mertani = new MertaniHenger(30,10);
        TomorHenger tomor = new TomorHenger(10,20,2);
        LyukasHenger lyukas = new LyukasHenger(10,31,2);
        System.out.println("m = " +mertani);
        System.out.println("t = " +tomor);
        System.out.println("ly = " +lyukas);
        System.out.println("Átlagtérfogat: "+ this.atlagTerfogat());
        System.out.println("Csövek össz. súlya: "+ this.csovekSulya());
    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }
    public double atlagTerfogat(){
        return 0.0;
    }
    public double csovekSulya(){
        return 0.0;
    }
    private List<MertaniHenger> lista(){

        return hengerek;
    }

}
