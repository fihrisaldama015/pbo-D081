import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("JAVA OVERLOADING METHOD");
        Vector3 myVector = new Vector3(1, 2, 3);
        Vector3 anotherVector = new Vector3(4, 5, 6);

        System.out.println("MyVector :");
        myVector.print();
        System.out.println("");

        System.out.println("Another Vector");
        anotherVector.print();

        System.out.print("\n\nInput Scalar Number : ");
        int scalar = input.nextInt();
        System.out.println("Multiply MyVector with scalar -> "+scalar);
        System.out.print("Result : ");
        myVector.multiply(scalar).print();
        System.out.println("");

        System.out.println("\nMultiply MyVector with Another Vector");
        myVector.print();
        System.out.print(" * ");
        anotherVector.print();
        System.out.println("");
        System.out.println("Result : "+myVector.multiply(anotherVector));
    }
}
