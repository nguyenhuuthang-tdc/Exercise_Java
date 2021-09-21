/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        outPut(num);      
    }
    //
    public static void outPut(int num) {
        int sum = 0;
        for (int i = num % 2; i <= num; i += 2) {
            sum += i;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    System.out.print("" + i);
                } else if (i == num) {
                    System.out.println(" + " + i + " = " + sum);
                } else {
                    System.out.print(" + " + i);
                }
            }  
        }
    }

}
