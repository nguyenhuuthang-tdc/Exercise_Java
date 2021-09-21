/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randNum = ThreadLocalRandom.current().nextInt(16, 30);
        System.out.println("Random number is : " + randNum);
    }

}
