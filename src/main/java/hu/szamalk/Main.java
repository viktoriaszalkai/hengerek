package hu.szamalk;

import hu.szamalk.model.LyukasHenger;
import hu.szamalk.model.MertaniHenger;
import hu.szamalk.model.TomorHenger;

public class Main {
    public static void main(String[] args) {
        MertaniHenger mertani = new MertaniHenger(30,10);
        TomorHenger tomor = new TomorHenger(10,20,2);
        LyukasHenger lyukas = new LyukasHenger(10,31,2);
        System.out.println("m = " +mertani);
        System.out.println("t = " +tomor);
        System.out.println("ly = " +lyukas);

        }
    }
