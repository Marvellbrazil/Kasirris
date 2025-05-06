/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Other;

import java.util.Random;

/**
 *
 * @author Passcape
 */
public class rng {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int length = 6;

        for (int x = 0; x < 5; x++) {
            for (int i = 1; i <= length; i++) {
                System.out.print(rand.nextInt(0, 9));
            }
            System.out.println("");
        }
    }
}
