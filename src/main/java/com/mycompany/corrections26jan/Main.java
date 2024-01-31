/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.corrections26jan;

/**
 *
 * @author Brigette Setlago
 */
import java.util.Scanner;

public class Main {
    public static void multiples(int x){
        int sum = 0;
        for(int i = 0;i < x; i++){
            if(i % 3 == 0 || i % 5 ==  0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int x = scanner.nextInt();
        multiples(x);
    }
}


  

    

    

