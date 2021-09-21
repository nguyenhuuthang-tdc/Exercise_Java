/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    //In 1 bảng cửu chương 
    public static void bangCuuChuong1So(int k) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("" + k + " * " + i + " = " + (k * i));
        }
    }

    //
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Nhập 1 số : ");
        num = input.nextInt();
        System.out.println("-----BẢNG CỬU CHƯƠNG CỦA " + num + "-----");
        bangCuuChuong1So(num);
        //
        int a = 1;
        System.out.println("-----BẢNG CỬU CHƯƠNG TỪ 2 ĐẾN 9-----");
        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print("" + j + " * " + a + " = " + (j * a) + "\t");
            }
            System.out.println("");
            a++;
        }
    }

}
