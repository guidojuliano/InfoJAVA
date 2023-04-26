package Iniciado;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        int resultado = num1 + num2;
        boolean divisible = num1 % num2 == 0;
        
        System.out.println("El resultado de la suma es: " + resultado);
        
        if (divisible) {
            System.out.println("El primer número es divisible por el segundo número");
        } else {
            System.out.println("El primer número no es divisible por el segundo número");
        }
    }
}
