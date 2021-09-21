/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        double cDegree, fDegree, result = 0;
        char choose;
        System.out.print("What kind of temperature do you want to convert? ? Press C or F : ");
        choose = input.nextLine().charAt(0);
        switch(choose) {
            case 'C' :
                System.out.print("Enter your C degree : ");
                cDegree = input.nextDouble();
                result = (double)9 / 5 * cDegree + 32;
                System.out.println("" + cDegree + "\u00B0C = " + String.format("%.2f", result) + "\u00B0F");
                break;
            case 'F' :
                System.out.print("Enter your F degree : ");
                fDegree = input.nextDouble();
                result = (double)5 / 9 * (fDegree - 32);
                System.out.println("" + fDegree + "\u00B0F = " + String.format("%.2f", result) + "\u00B0C");
                break;
            default : 
                System.out.println("Wrong type !!!");
        }
    }
    
}
