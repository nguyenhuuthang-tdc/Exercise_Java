/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static int input() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.print("Ban phai nhap so nguyen, hay nhap lai : ");
                input.nextLine();
            }
        }
        return n;
    }
    // UCLN function
    public static int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    //
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        int a, b, bCNN;
        System.out.print("Nhap a : ");
        a = input();
        System.out.print("Nhap b : ");
        b = input();
        System.out.println("UCLN cua " + a + " va " + b + " la : " + UCLN(a, b));
        bCNN = (a * b) / UCLN(a, b);
        System.out.println("BCNN cua " + a + " va " + b + " la : " + bCNN);
    }

}
