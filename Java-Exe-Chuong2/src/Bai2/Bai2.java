/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter your string : ");
        str = input.nextLine();
        splitString(str);
    }

    //
    public static void splitString(String str) {
        String[] arrString = str.trim().split(" ");
        for (int i = 0; i < arrString.length; i++) {
            System.out.print(" " + arrString[i].toUpperCase().charAt(0) + "\n");
        }
    }

}
