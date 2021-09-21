/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        System.out.println("NUMBER\t\t\tBINARY\t\t\tOCTAL\t\t\tHEXADECIMAL");
        for(int i = 1; i <= 256;i++) {
            System.out.println("" + i + "\t\t\t" + Integer.toBinaryString(i) + "\t\t\t" + Integer.toOctalString(i) + "\t\t\t" + Integer.toHexString(i));
        }
    }
    
}
