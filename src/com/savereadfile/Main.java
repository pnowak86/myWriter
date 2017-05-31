package com.savereadfile;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] table = new int[3][3];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;

        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;

        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;

        MyWriter mw = new MyWriter();
        mw.save(table);

        MyReader mr = new MyReader();
        mr.read(table);



//        int j = 0;
//        int i = 0;
//        while (j < table.length && i < table.length)
//            for (i = 0; i < table.length; i++) {
//                System.out.println(table[j][i]);
//            }
//        System.out.println("------------------------");
//
//        j = 1;
//        i = 0;
//        while (j < table.length && i < table.length)
//            for (i = 0; i < table.length; i++) {
//                System.out.println(table[j][i]);
//            }
//        System.out.println("-----------");
//        j = 2;
//        i = 0;
//        while (j < table.length && i < table.length)
//            for (i = 0; i < table.length; i++) {
//                System.out.println(table[j][i]);
//            }

//        j = 0;
//        while(j<table.length)
//            for (int i = 1; i <table.length ; i++) {
//                System.out.println(table[j][i]);
//                j++;
//            }
//        for (int i = 0; i < table.length ; i++) {
//            for (int j = 0; j < table.length -1 ; j++) {
//                System.out.println(table[i][j]);
//            }
//
//        }
    }
}
