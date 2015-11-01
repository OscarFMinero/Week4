package com.company;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int[] randomNumbers = new int[100];
        Random rand = new Random();

        int i;
        for(int stars = 0; stars < randomNumbers.length; ++stars) {
            i = rand.nextInt(101);
            randomNumbers[stars] = i;
        }

        String[] var6 = new String[]{"  1-10 |", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ",
                "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};

        for(i = 0; i < 100; ++i) {
            int next = randomNumbers[i];
            if(next < 11) {
                var6[0] = var6[0] + "*";
            } else if(next < 21) {
                var6[1] = var6[1] + "*";
            } else if(next < 31) {
                var6[2] = var6[2] + "*";
            } else if(next < 41) {
                var6[3] = var6[3] + "*";
            } else if(next < 51) {
                var6[4] = var6[4] + "*";
            } else if(next < 61) {
                var6[5] = var6[5] + "*";
            } else if(next < 71) {
                var6[6] = var6[6] + "*";
            } else if(next < 81) {
                var6[7] = var6[7] + "*";
            } else if(next < 91) {
                var6[8] = var6[8] + "*";
            } else {
                var6[9] = var6[9] + "*";
            }
        }

        for(i = 0; i < 10; ++i) {
            System.out.println(var6[i]);
        }


    }
}
