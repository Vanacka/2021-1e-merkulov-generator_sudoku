package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int[][] pole = new int[9][9];

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[i][j] = r.nextInt(9);
                pole[i][j] = pole[i][j] + 1;
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        System.out.println("Jses curak");
    }
}