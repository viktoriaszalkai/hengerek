package hu.szamalk;

import hu.szamalk.model.LyukasHenger;
import hu.szamalk.model.MertaniHenger;
import hu.szamalk.model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        MertaniHenger mertani = new MertaniHenger(30,10);
        TomorHenger tomor = new TomorHenger(10,20,2);
        LyukasHenger lyukas = new LyukasHenger(10,31,2);
        System.out.println("m = " +mertani);
        System.out.println("t = " +tomor);
        System.out.println("ly = " +lyukas);

        }



    public HengerProgram() {
        hengerek = new ArrayList<>();
    }
    public double AtlagTerfogat(){
        return 0.0;
    }
    public double csovekSulya(){
        return 0.0;
    }
    private List<MertaniHenger> lista(){

        return hengerek;
    }
    public void run(){

    }
}
