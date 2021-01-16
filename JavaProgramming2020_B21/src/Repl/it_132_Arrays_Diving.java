package Repl;

import java.util.Scanner;

public class it_132_Arrays_Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        float[] score = new float[7];
//
        float sum = 0, total = 0, degreeOfDifficulty;

        for (int i = 0; i <= score.length - 1; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();

            sum += score[i];
        }
        float max = score[0];
        float min = score[0];
        for (int i = 0; i < score.length; i++) {

            if (score[i] < min) {
                min = score[i];
            }
            if (score[i] > max) {
                max = score[i];
            }
        }
            sum = sum - min - max;

        System.out.println("Enter difficulty:");
        degreeOfDifficulty = input.nextFloat();
        total = sum * degreeOfDifficulty * 0.6f;


    }

}
