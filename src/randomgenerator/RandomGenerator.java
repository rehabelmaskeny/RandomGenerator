/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgenerator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author class
 */
public class RandomGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        int max = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the lower bound ");
        int lower = keyboard.nextInt();
        System.out.print("What is the upper bound ");
        int upper = keyboard.nextInt();

        int min = lower;

        System.out.print("the number of random integers to generate ");
        int numofran = keyboard.nextInt();

        for (int i = 0; i < numofran; i++) {
            Random random = new Random();
            int num = random.nextInt((upper - lower) + 1) + lower;
            System.out.println(num);
            avg += num;
            sum += num;
            if (max < num) {
                max = num;
            }
            for (int i2 = 0; i2 < max; i2++) {
                if (num < lower) {
                    lower++;
                    min = lower;
                }
                avg = avg / numofran;
                System.out.println("Average: " + avg);
                System.out.println("Sum： " + sum);
                System.out.println("Num of integer: " + numofran);
                System.out.println("minimum: " + min);
                System.out.println("maximum: " + max);

            }
        }
        
            
            
        
    

