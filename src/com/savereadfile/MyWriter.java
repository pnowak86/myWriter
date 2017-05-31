package com.savereadfile;

import java.io.*;
import java.util.Arrays;

/**
 * Created by RENT on 2017-05-31.
 */
public class MyWriter {
    public void save(int[][] arr){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
           fos = new FileOutputStream("abc.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

            int j = 0;
            int i = 0;
while (j<arr.length){

        for (i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[j][i]));
            bw.write(String.valueOf("; "));

        }
    bw.newLine();
    j++;
        for (i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[j][i]));
            bw.write(String.valueOf("; "));

        }
    bw.newLine();
    j++;
        for (i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[j][i]));
            bw.write(String.valueOf("; "));

        }
    bw.newLine();
    j++;

    bw.close();
    
}



//            int j = 0;
//            int i = 0;
//            while (j < arr.length && i < arr.length)
//                for (i = 0; i < arr.length; i++) {
//                    bw.write(String.valueOf(arr[j][i]));
//                    bw.write(String.valueOf("; "));
//
//                }
//            bw.newLine();
//            j = 1;
//            i = 0;
//            while (j < arr.length && i < arr.length)
//                for (i = 0; i < arr.length; i++) {
//                    bw.write(String.valueOf(arr[j][i]));
//                    bw.write(String.valueOf("; "));
//
//                }
//            bw.newLine();
//            j = 2;
//            i = 0;
//            while (j < arr.length && i < arr.length)
//                for (i = 0; i < arr.length; i++) {
//                    bw.write(String.valueOf(arr[j][i]));
//                    bw.write(String.valueOf("; "));
//
//                }
//            bw.newLine();
//            bw.close();


//            for (int i =0, j = 0; i <arr.length-1 ; i++) {
//                bw.write(String.valueOf(arr[i][j]));
//                bw.write(String.valueOf(";"));
//                bw.write(String.valueOf(arr[i][j]));
//            }





        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
