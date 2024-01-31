/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.corrections26jan;

/**
 *
 * @author Brigette Setlago
 */
import java.util.Scanner;
public class Main2 {
    public static boolean hasThree(int x, int y) {
        if (x == 3 || y == 3) {
            int sum = x + y;
            String strNumber = String.valueOf(sum);
            for (int i = 0; i < strNumber.length(); i++) {
                if (strNumber.charAt(i) == '3') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int x = scanner.nextInt();
        System.out.println("Input second number");
        int y = scanner.nextInt();
        if( x > 0 && y > 0){
            boolean result = hasThree(x, y);
            System.out.println(result);

        }
        else {
            System.out.println("Your inputs must be positive integers");
        }

    }
}
    

