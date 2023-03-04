package pertemuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Calculator Sederhana ==========");
        System.out.println("*pisahkan operator dengan spasi(\" \")");
        System.out.println("*operator -> (+) | (-) | (/) | (*) | (%)");
        System.out.println("Contoh input -> \"1 + 2 * 3 - 4 * 5\"");
        System.out.println("Masukkan input");
        System.out.print("-> ");
        String input_user = input.nextLine();

        Calculator my_calculator = new Calculator(input_user);
        System.out.println("Hasil = " + my_calculator.calculateHasil());
        input.close();
    }

}
