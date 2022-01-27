package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        int j = 7;
        int k = 7;
        for (int i = 0; i < 100;  i += 7) {

            System.out.println(i);
        }
        while (j < 100){
            System.out.println(j);
            j += 7;

        }
        do{
            System.out.println(k);
            k += 7;
        }while(k < 100);

        System.out.println("Please enter a word");
        text = input.nextLine();
        System.out.println(text);
        String newText = text.substring(1,text.length()-1);
        System.out.println(newText);





    }

}


