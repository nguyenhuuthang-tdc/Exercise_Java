/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguyễn Hữu Thắng");
        Scanner input = new Scanner(System.in);
        double bMI, weightInKilograms , heightInMeters ;
        System.out.print("Enter your weight (kilograms) : ");
        weightInKilograms  = input.nextDouble();
        System.out.print("Enter your height (metters) : ");
        heightInMeters  = input.nextDouble();
        bMI = weightInKilograms / (heightInMeters * heightInMeters);
        if(bMI < 18.5) {
            System.out.println("Underweight");
        } else if(bMI <= 24.9) {
            System.out.println("Normal");
        } else if(bMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
    
}
