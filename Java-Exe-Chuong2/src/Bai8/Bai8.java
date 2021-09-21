/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] trueAnswer = {"Very good!", "Excellent!", "Nice work!"};
        String[] wrongAnswer = {"No. Please try again.", "Wrong. Try once more.", " Don't give up!", "Wrong. Keep trying."};
        int a = 0;
        int b = 0;
        int answer;
        int choose;
        char[] cal = {'+', '-', '*'};

        do {
            a = ThreadLocalRandom.current().nextInt(1, 11);
            b = ThreadLocalRandom.current().nextInt(1, 11);
            char phepTinh = cal[ThreadLocalRandom.current().nextInt(0, 3)];
            int equal = 0;
            System.out.print("Question : " + a + " " + phepTinh + " " + b + " = ");
            answer = input.nextInt();
            switch (phepTinh) {
                case '+':
                    equal = a + b;
                    break;
                case '-':
                    equal = a - b;
                    break;
                case '*':
                    equal = a * b;
                    break;
            }
            if (answer == equal) {
                System.out.println("" + trueAnswer[ThreadLocalRandom.current().nextInt(0, 3)]);
            } else {
                System.out.println("" + wrongAnswer[ThreadLocalRandom.current().nextInt(0, 4)]);
                System.out.println("Answer is : " + equal);
            }
            System.out.println("Do you wanna continue : ");
            System.out.println("Press 1 to continue, 0 to end !!");
            choose = input.nextInt();
        } while (choose == 1);
    }

}
