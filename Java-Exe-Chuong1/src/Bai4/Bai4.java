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
        Scanner input = new Scanner(System.in);
        int width, height, area, perimeter = 0;
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.print("Enter height : ");
        height = input.nextInt();
        area = width * height;
        perimeter = (width + height) * 2;
        System.out.println("Area of Rectangle (" + width + ", " + height + ") is : " + area);
        System.out.println("Perimeter of Rectangle (" + width + ", " + height + ") is : " + perimeter);
    }
    
}
