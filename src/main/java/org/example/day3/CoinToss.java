package org.example.day3;

import java.util.Random;

public class CoinToss {

    public String tossACoin(){
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        if (toss == 0){
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

//    public static void main(String[] args) {
//        CoinToss game = new CoinToss();
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//        System.out.println(game.tossACoin());
//    }
}
