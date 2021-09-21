/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soLanTung;
        int[] faces = new int[6];
        System.out.print("Nhap so lan tung : ");
        soLanTung = input.nextInt();
        for (int i = 0; i < soLanTung; i++) {
            int result = ThreadLocalRandom.current().nextInt(1, 7);
            faces[result - 1]++;
        }
        //
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Số lần mặt " + (i + 1) + " xuất hiện : " + faces[i]);
        }
    }

}
