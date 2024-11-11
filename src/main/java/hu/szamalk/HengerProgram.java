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
    public HengerProgram() {
        hengerek = new ArrayList<>();
//        hengerek.add(new MertaniHenger(1,1));
//        hengerek.add(new TomorHenger(1,1));
//        hengerek.add(new TomorHenger(1,1,0.5));
//        hengerek.add(new LyukasHenger(1,1,0.1));
//        hengerek.add(new LyukasHenger(1,1,0.5));
        hengerek.add(new LyukasHenger(1,1,0.1));
    }
    public void run(){
        int db = MertaniHenger.getHengerDarab();
        System.out.printf("A felhasznált hengerek (%d db):\n", db);
        //for (MertaniHenger hengerek: hengerek){
        //    System.out.println(hengerek);
        //}

        for(MertaniHenger henger : this.lista()){
            System.out.println(henger);
        }
        System.out.println("Átlagtérfogat: "+ this.atlagTerfogat());
        System.out.println("Csövek össz. súlya: "+ this.csovekSulya());
        System.out.printf("A felhasznált hengerek (%d db):\n", db);
    }
    public double atlagTerfogat(){
        double ossz = 0.0;
        for(MertaniHenger henger : this.lista()){
            ossz += henger.terfogat();
        }
        return ossz/MertaniHenger.getHengerDarab();
    }
    public double csovekSulya(){
        double osszS = 0.0;
        for(MertaniHenger henger : this.lista()){
            if(henger instanceof LyukasHenger){
                osszS += ((LyukasHenger) henger).suly() ;
            }
        }
        return osszS;
    }
    private List<MertaniHenger> lista(){

        return hengerek;
    }

}
