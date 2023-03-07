/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author fihrisaldama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Calculator Sederhana ==========");
        System.out.println("*pisahkan operator dengan spasi(\" \")");
        System.out.println("*operator -> (+) | (-) | (/) | (*) | (%)");
        System.out.println("Contoh input -> \"1 + 1\"");
        System.out.println("Masukkan input");
        System.out.print("-> ");
        String input_user = input.nextLine();

        Calculator my_calculator = new Calculator(input_user);
        // System.out.println("input : " + my_calculator.getInput());
        System.out.println("Hasil = " + my_calculator.calculateHasil());
        input.close();
    }

}
