package com.ait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileArrayTest {

    public static void splitFiles(File [] fa, String [] s) throws FileNotFoundException
    {
        int partition = s.length/fa.length;

        for (int i = 0; i < fa.length; i++)
        {
            PrintWriter pw = new PrintWriter(fa[i]);

            for (int j =(i * partition); j < ((i+1) * partition); j++)
            {
                pw.println(s[j]);
            }

            pw.close();
        }

    }

    public static void main(String [] args) throws FileNotFoundException
    {
        File f = new File("lab3.txt");

        String words = null;

        Scanner sc = new Scanner(f);

        while(sc.hasNextLine())
        {
            words = words + sc.nextLine();
        }

        String [] wordsArray = words.split(" ");

        File [] fa = new File[5];

        for (int i = 0; i <fa.length; i++)
        {
            fa[i] = new File("./file"+ (i+1)+".txt");
        }

        splitFiles(fa, wordsArray);
    }

}
