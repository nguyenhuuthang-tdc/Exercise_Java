/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        int hour, minute, second, seconds = 0;
        System.out.print("Enter amount of seconds : ");
        seconds = input.nextInt();
        hour = seconds / 3600;
        minute = seconds / 60 % 60;
        second = seconds % 60 % 60;
        System.out.println("Result : " + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second));
    }
    
}
