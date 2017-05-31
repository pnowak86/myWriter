package com.savereadfile;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class MyReader {
    public void read(int[][] arr) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("abc.txt");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
                try {
                    for (int i = 0; i <arr.length; i++) {
                        String line = br.readLine();
                        System.out.println(line);
                    }

                    br.close();




                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
